package com.devshowcase.service;

import com.devshowcase.dto.FeedbackRequest;
import com.devshowcase.dto.FeedbackResponse;
import com.devshowcase.model.Feedback;
import com.devshowcase.model.Project;
import com.devshowcase.repository.FeedbackRepository;
import com.devshowcase.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;
    private final ProjectRepository projectRepository;

    public FeedbackService(
            FeedbackRepository feedbackRepository,
            ProjectRepository projectRepository) {
        this.feedbackRepository = feedbackRepository;
        this.projectRepository = projectRepository;
    }

    public FeedbackResponse create(FeedbackRequest request) {

        Project project = projectRepository.findById(request.getProjectId())
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado"));

        Feedback feedback = new Feedback(
                request.getComment(),
                request.getRating(),
                project
        );

        Feedback saved = feedbackRepository.save(feedback);

        return new FeedbackResponse(
                saved.getId(),
                saved.getComment(),
                saved.getRating(),
                saved.getProject().getId()
        );
    }
}