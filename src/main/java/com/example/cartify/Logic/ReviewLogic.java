package com.example.cartify.Logic;

import com.example.cartify.DAO.ReviewDAOI;
import com.example.cartify.Model.Input.Int_Review;
import com.example.cartify.Model.Output.FullReview;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Review;
import com.example.cartify.Model.Update.Udt_Review;

import javax.ejb.EJB;

public class ReviewLogic {
    @EJB
    ReviewDAOI reviewDAO;
    public GenericResponse createReview (Int_Review input) {
        Review review = reviewDAO.create(input.toReview());
        if (review == null) {
            return new GenericResponse(false);
        }
        else {
            return new GenericResponse(review);
        }
    }
    public GenericResponse updateReview (Udt_Review input) {
        Review object = reviewDAO.update(input.toReview(reviewDAO.getReviewbyId(input.getReviewId())));
        if (object == null) {
            return new GenericResponse(false);
        }
        else {
            return new GenericResponse(object);
        }
    }
    public FullReview getFullReview (Integer reviewId) {
        return getFullReview(reviewDAO.getReviewbyId(reviewId));
    }
    public FullReview getFullReview (Review review) {
        return new FullReview(review, reviewDAO.findByFieldEqual("subCommentOfId", review.getId()));
    }
}
