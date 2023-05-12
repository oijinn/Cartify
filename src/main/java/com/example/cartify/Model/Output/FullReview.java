package com.example.cartify.Model.Output;

import com.example.cartify.Model.Review;

import java.util.Comparator;
import java.util.List;

public class FullReview {
    private Review mainReview;
    private List<Review> comment;
    public FullReview (Review review, List<Review> comment){
        this.mainReview = review;
        comment.sort(Comparator.comparing(Review::getLastUpdated).reversed());
        this.comment = comment;
    }

    public Review getMainReview() {
        return mainReview;
    }

    public void setMainReview(Review mainReview) {
        this.mainReview = mainReview;
    }

    public List<Review> getComment() {
        return comment;
    }

    public void setComment(List<Review> comment) {
        this.comment = comment;
    }
}
