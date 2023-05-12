package com.example.cartify.DAO;

import com.example.cartify.Model.Payment;

import javax.ejb.Local;
import java.util.List;

@Local
public interface PaymentDAOI {
    Payment create(Payment input);
    Payment update(Payment input);
    boolean bulkUpdate (List<Payment> list, String column, String value);
    boolean delete(Payment input);
    Payment getPaymentbyId(Integer id);
    List<Payment> getAllPayment ();
    List<Payment> findByFieldEqual (String column, Object value);
    List<Payment> findByConditionLike (String column , String value);
}
