package com.example.cartify.Model.Update;


import com.example.cartify.Model.Product;

import java.time.LocalDateTime;
public class Udt_Product {
    private int productId;
    private String Name;
    private String Description;
    private Double Price;
    private byte[] Picture;

    public Product toProduct(Product product){
        product.setName(Name);
        product.setDescription(Description);
        product.setPrice(Price);
        product.setPicture(Picture);
        product.setLastUpdated(LocalDateTime.now());
        return product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
}
