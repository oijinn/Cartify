package com.example.cartify.DAO;

import com.example.cartify.Model.Review;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ReviewDAOI {
    Review create(Review input);
    Review update(Review input);
    boolean bulkUpdate (List<Review> list, String column, String value);
    boolean delete(Integer input);
    Review getReviewbyId(Integer id);
    List<Review> getAllReview ();
    List<Review> findByFieldEqual (String column, Object value);
}
