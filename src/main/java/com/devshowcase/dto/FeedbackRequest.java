package com.devshowcase.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
public class FeedbackRequest {
    @NotBlank
    private String comment;
    @Min(1)
    @Max(5)
private Integer rating;

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
}