package com.example.cartify.Model;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author 60112
 */
@Entity
@Table(schema = "EPDA")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int customerID;
    private int productID;
    private String productName;
    private Double Price;
    private Integer quantity;
    private LocalDateTime creationDate = LocalDateTime.now();
    private LocalDateTime lastUpdated = LocalDateTime.now();

    public Order(int customerID, int productID, String productName, Double price, Integer quantity) {
        this.customerID = customerID;
        this.productID = productID;
        this.productName = productName;
        Price = price;
        this.quantity = quantity;
    }

    public Order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
