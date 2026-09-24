package com.devshowcase.dto;



import java.util.List;

    public class ProjectRequest {

        private String name;
        private String description;
        private String githubUrl;
        private Long profileId;
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
