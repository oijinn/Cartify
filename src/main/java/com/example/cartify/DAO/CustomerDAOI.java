package com.example.cartify.DAO;

import com.example.cartify.Model.Customer;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CustomerDAOI {
    Customer create(Customer input);
    Customer update(Customer input);
    boolean bulkUpdate (List<Customer> list, String column, String value);
    boolean delete(Customer input);
    Customer getCustomerbyId(Integer id);
    List<Customer> getAllCustomer ();
    List<Customer> findByFieldEqual (String column, Object value);
    List<Customer> searchCustomer (String value);
}
