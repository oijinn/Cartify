package com.example.cartify.Model.Update;

import com.example.cartify.Model.Customer;

import java.time.LocalDateTime;

public class Udt_Customer {
    private int customerId;
    private String Name;
    private String Phone;
    private String Country;
    private byte[] Picture;
    private String email;
    private String password;
    public Udt_User toUpdateUser (Integer userId) {
        Udt_User update = new Udt_User();
        update.setUserId(userId);
        update.setPassword(password);
        update.setEmail(email);
        return update;
    }
    public Customer toCustomer(Customer customer){
        customer.setPicture(Picture);
        customer.setName(Name);
        customer.setPhone(Phone);
        customer.setCountry(Country);
        customer.setLastUpdated(LocalDateTime.now());
        return customer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
}
