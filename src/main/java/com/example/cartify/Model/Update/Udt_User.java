package com.example.cartify.Model.Update;

import com.example.cartify.Model.User;
public class Udt_User {
    private int userId;
    private String email;
    private String password;

    public User toUser(User user){
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
