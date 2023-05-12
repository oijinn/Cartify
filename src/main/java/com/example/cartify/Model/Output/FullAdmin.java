package com.example.cartify.Model.Output;

import com.example.cartify.Model.Admin;
import com.example.cartify.Model.User;

import java.time.LocalDateTime;
public class FullAdmin {
    private int id;
    private String Name;
    private String Phone;
    private byte[] Picture;
    private LocalDateTime lastUpdated;
    private String email;

    public FullAdmin(int id, String name, String phone, byte[] picture, LocalDateTime lastUpdated, String email) {
        this.id = id;
        Name = name;
        Phone = phone;
        Picture = picture;
        this.lastUpdated = lastUpdated;
        this.email = email;
    }

    public FullAdmin (Admin admin, User user){
        this.id = admin.getId();
        Name = admin.getName();
        Phone = admin.getPhone();
        Picture = admin.getPicture();
        this.lastUpdated = admin.getLastUpdated();
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

    public byte[] getPicture() {
        return Picture;
    }

    public void setPicture(byte[] picture) {
        Picture = picture;
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
