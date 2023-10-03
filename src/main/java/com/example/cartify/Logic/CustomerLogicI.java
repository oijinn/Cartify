package com.example.cartify.Logic;

import com.example.cartify.Model.Customer;
import com.example.cartify.Model.Input.Int_Customer;
import com.example.cartify.Model.Output.FullCustomer;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Update.Udt_Customer;
import com.example.cartify.Model.User;

import javax.ejb.Local;

@Local
public interface CustomerLogicI {

    GenericResponse register (Int_Customer input);
    GenericResponse update (Udt_Customer input);
    FullCustomer getFullCustomer (Integer userId);
    FullCustomer getFullCustomer (User user);
    GenericResponse delete(Integer customerId);
    FullCustomer getFullCustomer (Customer customer);
    FullCustomer getFullCustomer (Customer customer, User user);
}
