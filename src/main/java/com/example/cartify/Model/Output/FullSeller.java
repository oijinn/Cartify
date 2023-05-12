package com.example.cartify.Model.Output;

import com.example.cartify.Model.Seller;
import com.example.cartify.Model.User;

import java.time.LocalDateTime;
public class FullSeller {
    private int id;
    private String Name;
    private String Phone;
    private String Country;
    private byte[] Picture;
    private Double Balance;
    private LocalDateTime lastUpdated = LocalDateTime.now();
    private String email;

    public FullSeller(int id, String name, String phone, String country, byte[] picture, Double balance, LocalDateTime lastUpdated, String email) {
        this.id = id;
        Name = name;
        Phone = phone;
        Country = country;
        Picture = picture;
        Balance = balance;
        this.lastUpdated = lastUpdated;
        this.email = email;
    }
    public FullSeller(Seller seller, User user) {
        this.id = seller.getId();
        Name = seller.getName();
        Phone = seller.getPhone();
        Country = seller.getCountry();
        Picture = seller.getPicture();
        Balance = seller.getBalance();
        this.lastUpdated = seller.getLastUpdated();
        this.email = user.getEmail();
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

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
