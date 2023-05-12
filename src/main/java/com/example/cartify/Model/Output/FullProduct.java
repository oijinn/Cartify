package com.example.cartify.Model.Output;

import com.example.cartify.Model.Product;
import com.example.cartify.Model.Review;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class FullProduct {
    private int id;
    private String Name;
    private String Description;
    private Integer sellerID;
    private Double Price;
    private byte[] Picture;
    private LocalDateTime creationDate = LocalDateTime.now();
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private Double averageRating;
    private List<FullReview> reviewList;

    public FullProduct(Product product, List<FullReview> reviewList) {
        this.id = product.getId();
        Name = product.getName();
        Description = product.getDescription();
        sellerID = product.getSellerID();
        Price = product.getPrice();
        Picture = product.getPicture();
        this.creationDate = product.getCreationDate();
        this.lastUpdated = product.getLastUpdated();
        this.reviewList = reviewList;
        this.averageRating = reviewList.stream()
                .flatMap(fullReview -> Stream.concat(Stream.of(fullReview.getMainReview()), fullReview.getComment().stream()))
                .mapToInt(Review::getRating).average().orElse(0.0);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getSellerID() {
        return sellerID;
    }

    public void setSellerID(Integer sellerID) {
        this.sellerID = sellerID;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] picture) {
        Picture = picture;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public List<FullReview> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<FullReview> reviewList) {
        this.reviewList = reviewList;
    }
}
