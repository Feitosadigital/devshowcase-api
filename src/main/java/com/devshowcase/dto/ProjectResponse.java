package com.devshowcase.dto;

import java.util.List;

public class ProjectResponse {

    private Long id;
    private String name;
    private String description;
    private String githubUrl;
    private Long profileId;
    private List<Long> technologyIds;

    public ProjectResponse(Long id, String name, String description, String githubUrl,
                           Long profileId, List<Long> technologyIds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.githubUrl = githubUrl;
        this.profileId = profileId;
        this.technologyIds = technologyIds;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public Long getProfileId() {
        return profileId;
    }

    public List<Long> getTechnologyIds() {
        return technologyIds;
    }
}
