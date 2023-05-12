package com.example.cartify.Model.Input;

import com.example.cartify.Model.Payment;
public class Int_Payment {
    private Integer orderID;
    private Double Price;
    private String cardNumber;
    private String expireDate;
    private String cvc;
    private String cardHolderName;

    public Payment toPayment(Integer sellerID,Integer customerID){
        Payment payment = new Payment(false,customerID,sellerID,orderID,Price,cardNumber,expireDate,cvc,cardHolderName);
        return payment;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
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
}
