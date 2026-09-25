package com.devshowcase.dto;



import java.util.List;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;
    public class ProjectRequest {
        @NotBlank
        private String name;
        @NotBlank
        private String description;
        @URL
        private String githubUrl;
        @NotNull
        private Long profileId;
        @NotEmpty
        private List<Long> technologyIds;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGithubUrl() {
            return githubUrl;
        }

        public void setGithubUrl(String githubUrl) {
            this.githubUrl = githubUrl;
        }

        public Long getProfileId() {
            return profileId;
        }

        public void setProfileId(Long profileId) {
            this.profileId = profileId;
        }

        public List<Long> getTechnologyIds() {
            return technologyIds;
        }

        public void setTechnologyIds(List<Long> technologyIds) {
            this.technologyIds = technologyIds;
        }
    }
