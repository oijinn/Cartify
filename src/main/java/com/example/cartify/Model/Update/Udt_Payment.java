package com.example.cartify.Model.Update;

import com.example.cartify.Model.Payment;

import java.time.LocalDateTime;

public class Udt_Payment {
    private int paymentId;
    private Double Price;
    private String cardNumber;
    private String expireDate;
    private String cvc;
    private String cardHolderName;
    private Boolean isPaid = false;

    public Payment toPayment(Payment payment){
        payment.setPrice(Price);
        payment.setCardNumber(cardNumber);
        payment.setExpireDate(expireDate);
        payment.setCvc(cvc);
        payment.setCardHolderName(cardHolderName);
        payment.setLastUpdated(LocalDateTime.now());
        payment.setPaid(isPaid);
        return payment;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
}
