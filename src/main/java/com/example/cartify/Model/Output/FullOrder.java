package com.example.cartify.Model.Output;

import com.example.cartify.Model.Order;
import com.example.cartify.Model.Payment;
public class FullOrder {
    private Order order;
    private Payment payment;

    public FullOrder(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
