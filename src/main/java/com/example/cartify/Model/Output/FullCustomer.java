package com.example.cartify.Model.Output;

import com.example.cartify.Model.Customer;
import com.example.cartify.Model.User;

import java.time.LocalDateTime;

public class FullCustomer {
    private int id;
    private String Name;
    private String Phone;
    private String Country;
    private byte[] Picture;
    private String email;
    private LocalDateTime lastUpdated;

    public FullCustomer(int id, String name, String phone, String country, byte[] picture, String email, LocalDateTime lastUpdated) {
        this.id = id;
        Name = name;
        Phone = phone;
        Country = country;
        Picture = picture;
        this.email = email;
        this.lastUpdated = lastUpdated;
    }

    public FullCustomer(Customer customer, User user){
        this.id = customer.getId();
        Name = customer.getName();
        Phone = customer.getPhone();
        Country = customer.getCountry();
        Picture = customer.getPicture();
        this.lastUpdated = customer.getLastUpdated();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
