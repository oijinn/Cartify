package com.example.cartify.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author 60112
 */
@Entity
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int orderID;
    private int productID;
    private int userID;
    private int Rating;
    private String Description;
    private Integer subCommentOfId;
    private LocalDateTime lastUpdated = LocalDateTime.now();

    public Review(int orderID, int productID, int userID, int rating, String description, LocalDateTime lastUpdated,Integer subCommentOfId) {
        this.orderID = orderID;
        this.productID = productID;
        this.userID = userID;
        Rating = rating;
        Description = description;
        this.lastUpdated = lastUpdated;
        this.subCommentOfId = subCommentOfId;
    }

    public Review() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getSubCommentOfId() {
        return subCommentOfId;
    }

    public void setSubCommentOfId(Integer subCommentOfId) {
        this.subCommentOfId = subCommentOfId;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
