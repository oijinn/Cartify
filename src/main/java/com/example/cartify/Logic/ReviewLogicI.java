package com.example.cartify.Logic;

import com.example.cartify.Model.Input.Int_Review;
import com.example.cartify.Model.Output.FullReview;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Review;
import com.example.cartify.Model.Update.Udt_Review;

import javax.ejb.Local;

@Local
public interface ReviewLogicI {
    GenericResponse createReview (Int_Review input);
    GenericResponse updateReview (Udt_Review input);
    FullReview getFullReview (Integer reviewId);
    FullReview getFullReview (Review review);
}
