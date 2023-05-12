package com.example.cartify.Model.Input;


import com.example.cartify.Model.Product;
public class Int_Product {
    private String Name;
    private String Description;
    private Integer sellerID;
    private Double Price;
    private byte[] Picture;

    public Product toProduct(){
        Product product = new Product();
        product.setName(Name);
        product.setDescription(Description);
        product.setSellerID(sellerID);
        product.setPrice(Price);
        product.setPicture(Picture);
        return product;
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
}
