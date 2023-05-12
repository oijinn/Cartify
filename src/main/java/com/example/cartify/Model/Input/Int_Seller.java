package com.example.cartify.Model.Input;

import com.example.cartify.Model.Seller;
import com.example.cartify.Model.User;
public class Int_Seller {
    private String name;
    private String phone;
    private String country;
    private byte[] picture;
    private String email;
    private String password;
    private String account_type;
    private Integer userId;
    public User toUser(){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setAccount_type(account_type);
        return user;
    }
    public Seller toSeller(){
        Seller seller = new Seller();
        seller.setName(name);
        seller.setPhone(phone);
        seller.setCountry(country);
        seller.setPicture(picture);
        seller.setUserId(userId);
        seller.setBalance(0.0);
        return seller;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
