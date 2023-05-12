package com.example.cartify.Model.Input;

import com.example.cartify.Model.Review;
public class Int_Review {
    private int orderID;
    private int productID;
    private int userID;
    private int rating;
    private String description;
    private Integer subCommentOfId;

    public Review toReview(){
        Review review = new Review();
        review.setOrderID(orderID);
        review.setUserID(userID);
        review.setProductID(productID);
        review.setRating(rating);
        review.setDescription(description);
        review.setSubCommentOfId(subCommentOfId);
        return review;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public Integer getSubCommentOfId() {
        return subCommentOfId;
    }

    public void setSubCommentOfId(Integer subCommentOfId) {
        this.subCommentOfId = subCommentOfId;
    }
}
