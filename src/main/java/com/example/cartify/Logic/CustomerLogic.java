package com.example.cartify.Logic;

import com.example.cartify.DAO.CustomerDAOI;
import com.example.cartify.DAO.UserDAOI;
import com.example.cartify.Model.Customer;
import com.example.cartify.Model.Input.Int_Customer;
import com.example.cartify.Model.Output.FullCustomer;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Update.Udt_Customer;
import com.example.cartify.Model.User;

import javax.ejb.EJB;
import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {
    @EJB
    CustomerDAOI customerDAO;
    @EJB
    UserDAOI userDAO;

    public GenericResponse register (Int_Customer input){
        User user = userDAO.create(input.toUser());
        if (user == null) {
            return new GenericResponse(false);
        }
        input.setUserId(user.getId());
        Customer customer = customerDAO.create(input.toCustomer());
        if (customer == null) {
            userDAO.delete(user);
            return new GenericResponse(false);
        }
        return new GenericResponse(customer);
    }
    public GenericResponse update (Udt_Customer input){
        Customer customer = customerDAO.getCustomerbyId(input.getCustomerId());
        User user = userDAO.update(input.toUpdateUser(customer.getUserId()).toUser(userDAO.getUserbyId(customer.getUserId())));
        if (user == null) {
            return new GenericResponse(false);
        }else {
            Customer customer1 = customerDAO.update(input.toCustomer(customer));
            if (customer1 == null) {
                return new GenericResponse(false);
            }
            return new GenericResponse(customer1);
        }
    }
    public FullCustomer getFullCustomer (Integer userId){
        User user = userDAO.getUserbyId(userId);
        return getFullCustomer(user);
    }
    public FullCustomer getFullCustomer (User user){
        Customer customer = customerDAO.findByFieldEqual("userId",user.getId()).get(0);
        return getFullCustomer(customer);
    }

    public GenericResponse delete(Integer customerId) {
        Customer customer = customerDAO.getCustomerbyId(customerId);
        User user = userDAO.getUserbyId(customer.getUserId());
        List<Boolean> result = new ArrayList<>();
        result.add(customerDAO.delete(customer));
        result.add(userDAO.delete(user));
        return new GenericResponse(!result.stream().anyMatch(x->!x));
    }

    public FullCustomer getFullCustomer (Customer customer){
        return getFullCustomer(customer,userDAO.getUserbyId(customer.getUserId()));
    }
    public FullCustomer getFullCustomer (Customer customer, User user){
        return new FullCustomer(customer,user);
    }
}
