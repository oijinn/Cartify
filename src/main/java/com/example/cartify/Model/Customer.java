package com.example.cartify.Model;

import javax.persistence.*;
import javax.xml.validation.Schema;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author 60112
 */
@Entity
@Table(schema = "EPDA")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Name;
    private String Phone;
    private String Country;
    private byte[] Picture;
    private int userId;
    private LocalDateTime lastUpdated = LocalDateTime.now();

    public Customer(String name, String phone, String country, byte[] picture, int userId) {
        Name = name;
        Phone = phone;
        Country = country;
        Picture = picture;
        this.userId = userId;
    }

    public Customer() {

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
