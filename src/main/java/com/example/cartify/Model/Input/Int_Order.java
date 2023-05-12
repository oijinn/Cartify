package com.example.cartify.Model.Input;

import com.example.cartify.Model.Order;
public class Int_Order {
    private Integer customerID;
    private Integer productID;
    private String productName;
    private Double Price;
    private Integer quantity;

    public Order toOrder(){
        Order order = new Order(customerID,productID,productName,Price,quantity);
        return order;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
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
}
