package com.example.cartify.Model.Update;

import com.example.cartify.Model.Order;

import java.time.LocalDateTime;

public class Udt_Order {
    private int orderId;
    private String productName;
    private Double Price;
    private Integer quantity;

    public Order toOrder(Order order){
        order.setProductName(productName);
        order.setPrice(Price);
        order.setQuantity(quantity);
        order.setLastUpdated(LocalDateTime.now());
        return order;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
