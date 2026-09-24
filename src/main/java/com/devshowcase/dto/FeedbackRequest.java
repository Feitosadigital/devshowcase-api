package com.devshowcase.dto;
public class FeedbackRequest {
private String comment;
private Integer rating;
private Long projectId;

public String getComment() {
    return comment;
}

public void setComment(String comment) {
    this.comment = comment;
}

public Integer getRating() {
    return rating;
}

public void setRating(Integer rating) {
    this.rating = rating;
}

public Long getProjectId() {
    return projectId;
}

public void setProjectId(Long projectId) {
    this.projectId = projectId;
}
}