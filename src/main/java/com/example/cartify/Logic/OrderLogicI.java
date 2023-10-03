package com.example.cartify.Logic;

import com.example.cartify.Model.Input.Int_Order;
import com.example.cartify.Model.Input.Int_Payment;
import com.example.cartify.Model.Order;
import com.example.cartify.Model.Output.GenericResponse;

import javax.ejb.Local;
import java.util.List;

@Local
public interface OrderLogicI {
    GenericResponse createOrder (Int_Order input);
    GenericResponse makePayment (Int_Payment input);
    GenericResponse findOrderByOrderId (Integer orderId);
    GenericResponse findAll ();
    GenericResponse findFullOrder (Integer orderId);
    GenericResponse findOrdersBySellerId (Integer sellerId);
    GenericResponse findPendingOrdersBySellerId (Integer sellerId);
    GenericResponse findCompletedOrdersBySellerId (Integer sellerId);
    GenericResponse findOrdersByCustomerId (Integer customerId);
    GenericResponse findPendingOrdersByCustomerId (Integer customerId);
    GenericResponse findCompletedOrdersByCustomerId (Integer customerId);
    List<Order> findAllCompletedOrders ();

}
