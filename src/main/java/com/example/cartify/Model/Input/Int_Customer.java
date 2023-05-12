package com.example.cartify.Model.Input;

import com.example.cartify.Model.Customer;
import com.example.cartify.Model.User;
public class Int_Customer {
    private String Name;
    private String Phone;
    private String Country;
    private byte[] Picture;
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
    public Customer toCustomer(){
        Customer customer = new Customer(Name,Phone,Country,Picture, userId);
        return customer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] picture) {
        Picture = picture;
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
