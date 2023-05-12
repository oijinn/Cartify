package com.example.cartify.Model.Update;

import com.example.cartify.Model.Seller;
public class Udt_Seller {
    private int sellerId;
    private String name;
    private String phone;
    private String country;
    private byte[] picture;
    private String email;
    private String password;
    public Udt_User toUpdateUser (Integer userId) {
        Udt_User update = new Udt_User();
        update.setUserId(userId);
        update.setPassword(password);
        update.setEmail(email);
        return update;
    }
    public Seller toSeller(Seller seller){
        seller.setName(name);
        seller.setPhone(phone);
        seller.setCountry(country);
        seller.setPicture(picture);
        return seller;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
