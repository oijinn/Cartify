package com.example.cartify.Model.Update;

import com.example.cartify.Model.Admin;
import java.time.LocalDateTime;

public class Udt_Admin {
    private int adminId;
    private String name;
    private String phone;
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
    public Admin toAdmin(Admin admin){
        admin.setName(name);
        admin.setPicture(picture);
        admin.setPhone(phone);
        admin.setLastUpdated(LocalDateTime.now());
        return admin;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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
