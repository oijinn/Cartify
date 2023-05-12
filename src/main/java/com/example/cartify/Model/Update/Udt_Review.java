package com.example.cartify.Model.Update;

import com.example.cartify.Model.Review;

import java.time.LocalDateTime;
public class Udt_Review {
    private int reviewId;
    private int rating;
    private String description;

    public Review toReview(Review review){
        review.setRating(rating);
        review.setDescription(description);
        review.setLastUpdated(LocalDateTime.now());
        return review;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
