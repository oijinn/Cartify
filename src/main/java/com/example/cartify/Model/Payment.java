package com.example.cartify.Model;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author 60112
 */
@Entity
@Table (schema = "EPDA")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Boolean isPaid = false;
    private int customerID;
    private int sellerID;
    private int orderID;
    private Double Price;
    private String cardNumber;
    private String expireDate;
    private String cvc;
    private String cardHolderName;
    private LocalDateTime creationDate = LocalDateTime.now();
    private LocalDateTime lastUpdated = LocalDateTime.now();

    public Payment(Boolean isPaid, int customerID, int sellerID, int orderID, Double price, String cardNumber, String expireDate, String cvc, String cardHolderName) {
        this.isPaid = isPaid;
        this.customerID = customerID;
        this.sellerID = sellerID;
        this.orderID = orderID;
        Price = price;
        this.cardNumber = cardNumber;
        this.expireDate = expireDate;
        this.cvc = cvc;
        this.cardHolderName = cardHolderName;
    }


    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

