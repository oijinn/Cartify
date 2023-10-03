package com.example.cartify.Model;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author 60112
 */
@Entity
@Table(schema = "EPDA")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Name;
    private String Description;
    private Integer sellerID;
    private Double Price;
    private byte[] Picture;
    private LocalDateTime creationDate = LocalDateTime.now();
    private LocalDateTime lastUpdated = LocalDateTime.now();

    public Product(String name, String description, int sellerID, Double price, byte[] picture) {
        Name = name;
        Description = description;
        this.sellerID = sellerID;
        Price = price;
        Picture = picture;
    }

    public Product() {

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
}

