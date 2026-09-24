package com.devshowcase.service;

import com.devshowcase.dto.ProjectRequest;
import com.devshowcase.dto.ProjectResponse;
import com.devshowcase.model.Profile;
import com.devshowcase.model.Project;
import com.devshowcase.model.Technology;
import com.devshowcase.repository.ProfileRepository;
import com.devshowcase.repository.ProjectRepository;
import com.devshowcase.repository.TechnologyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProfileRepository profileRepository;
    private final TechnologyRepository technologyRepository;

    public ProjectService(
            ProjectRepository projectRepository,
            ProfileRepository profileRepository,
            TechnologyRepository technologyRepository) {
        this.projectRepository = projectRepository;
        this.profileRepository = profileRepository;
        this.technologyRepository = technologyRepository;
    }

    public ProjectResponse create(ProjectRequest request) {

        Profile profile = profileRepository.findById(request.getProfileId())
                .orElseThrow(() -> new RuntimeException("Perfil não encontrado"));

        List<Technology> technologies = technologyRepository.findAllById(
                request.getTechnologyIds()
        );

        Project project = new Project(
                request.getName(),
                request.getDescription(),
                request.getGithubUrl(),
                profile
        );

        project.setTechnologies(technologies);

        Project saved = projectRepository.save(project);

        return new ProjectResponse(
                saved.getId(),
                saved.getName(),
                saved.getDescription(),
                saved.getUrl(),
                saved.getProfile().getId(),
                saved.getTechnologies()
                        .stream()
                        .map(Technology::getId)
                        .toList()
        );
    }

    public List<ProjectResponse> findAll() {
        return projectRepository.findAll()
                .stream()
                .map(project -> new ProjectResponse(
                        project.getId(),
                        project.getName(),
                        project.getDescription(),
                        project.getUrl(),
                        project.getProfile().getId(),
                        project.getTechnologies()
                                .stream()
                                .map(Technology::getId)
                                .toList()
                ))
                .toList();
    }
}