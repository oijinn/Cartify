package com.example.cartify.Logic;

import com.example.cartify.DAO.OrderDAOI;
import com.example.cartify.DAO.PaymentDAOI;
import com.example.cartify.DAO.ProductDAOI;
import com.example.cartify.DAO.SellerDAOI;
import com.example.cartify.Model.Input.Int_Order;
import com.example.cartify.Model.Input.Int_Payment;
import com.example.cartify.Model.Order;
import com.example.cartify.Model.Output.FullOrder;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Payment;
import com.example.cartify.Model.Product;
import com.example.cartify.Model.Seller;

import javax.ejb.EJB;
import java.util.List;
import java.util.stream.Collectors;
public class OrderLogic {
    @EJB
    OrderDAOI orderDAO;
    @EJB
    PaymentDAOI paymentDAO;
    @EJB
    ProductDAOI productDAO;
    @EJB
    SellerDAOI sellerDAO;
    public GenericResponse createOrder (Int_Order input) {
        Order order = orderDAO.create(input.toOrder());
        if (order == null) {
            return new GenericResponse(false);
        }
        return new GenericResponse(order);
    }
    public GenericResponse makePayment (Int_Payment input){
        Order order = orderDAO.getOrderbyId(input.getOrderID());
        if (order == null) {
            return new GenericResponse(false);
        }
        Product product = productDAO.getProductbyId(order.getProductID());
        Seller seller = sellerDAO.getSellerbyId(product.getSellerID());
        seller.setBalance(seller.getBalance() + input.getPrice());
        Seller seller1 = sellerDAO.update(seller);
        if ( seller1== null) {
            orderDAO.delete(order);
            return new GenericResponse(false);
        }
        Payment payment = paymentDAO.create(input.toPayment(product.getSellerID(),order.getCustomerID()));
        if ( payment== null){
            sellerDAO.delete(seller1);
            orderDAO.delete(order);
            return new GenericResponse(false);
        }
        else {
            return new GenericResponse(payment);
        }
    }
    public GenericResponse findOrderByOrderId (Integer orderId) {
        return new GenericResponse(orderDAO.getOrderbyId(orderId));
    }
    public GenericResponse findAll () {
        return new GenericResponse(orderDAO.getAllOrder());
    }
    public GenericResponse findFullOrder (Integer orderId) {
        return new GenericResponse(new FullOrder(orderDAO.getOrderbyId(orderId), paymentDAO.findByFieldEqual("orderID", orderId).get(0)));
    }
    public GenericResponse findOrdersBySellerId (Integer sellerId) {
        List<Product> sellerProducts = productDAO.findByFieldEqual("sellerID",sellerId);
        return new GenericResponse(sellerProducts
                .stream()
                .map (x->orderDAO.findByFieldEqual("productID",x.getId()))
                .collect(Collectors.toList()));
    }

    public GenericResponse findPendingOrdersBySellerId (Integer sellerId) {
        List<Order> orders = (List<Order>)findOrdersBySellerId(sellerId).getOutput();
        return new GenericResponse(orders.stream().filter(x-> {
            List<Payment> payments = paymentDAO.findByFieldEqual("orderID", x.getId());
            if (payments.isEmpty() || payments == null) {
                return true;
            }
            else {
                return false;
            }
        }).collect(Collectors.toList()));
    }
    public GenericResponse findCompletedOrdersBySellerId (Integer sellerId) {
        List<Order> orders = (List<Order>)findOrdersBySellerId(sellerId).getOutput();
        return new GenericResponse(orders.stream().filter(x-> {
            List<Payment> payments = paymentDAO.findByFieldEqual("orderID", x.getId());
            if (payments.isEmpty() || payments == null) {
                return false;
            }
            else {
                return true;
            }
        }).collect(Collectors.toList()));
    }
    public GenericResponse findOrdersByCustomerId (Integer customerId) {
        return new GenericResponse(orderDAO.findByFieldEqual("customerID", customerId));
    }
    public GenericResponse findPendingOrdersByCustomerId (Integer customerId) {
        List<Order> orders = (List<Order>)findOrdersByCustomerId(customerId).getOutput();
        return new GenericResponse(orders.stream().filter(x-> {
            List<Payment> payments = paymentDAO.findByFieldEqual("orderID", x.getId());
            if (payments.isEmpty() || payments == null) {
                return true;
            }
            else {
                return false;
            }
        }).collect(Collectors.toList()));
    }
    public GenericResponse findCompletedOrdersByCustomerId (Integer customerId) {
        List<Order> orders = (List<Order>)findOrdersByCustomerId(customerId).getOutput();
        return new GenericResponse(orders.stream().filter(x-> {
            List<Payment> payments = paymentDAO.findByFieldEqual("orderID", x.getId());
            if (payments.isEmpty() || payments == null) {
                return false;
            }
            else {
                return true;
            }
        }).collect(Collectors.toList()));
    }
    public List<Order> findAllCompletedOrders () {
        List<Order> orders = orderDAO.getAllOrder();
        return orders.stream().filter(x-> {
            List<Payment> payments = paymentDAO.findByFieldEqual("orderID", x.getId());
            if (payments.isEmpty() || payments == null) {
                return false;
            }
            else {
                return true;
            }
        }).collect(Collectors.toList());
    }
}
