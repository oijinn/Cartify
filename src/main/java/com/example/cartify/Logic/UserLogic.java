package com.example.cartify.Logic;

import com.example.cartify.DAO.UserDAOI;
import com.example.cartify.Model.Input.Int_Userlogin;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless

public class UserLogic {
    @EJB
    UserDAOI userDAO;
    @EJB
    SellerLogic sellerLogic;
    @EJB
    CustomerLogic customerLogic;
    @EJB
    AdminLogic adminLogic;

    public GenericResponse login (Int_Userlogin input){
        User user = userDAO.findByFieldEqual("Email", input.getEmail()).get(0);
        if (!input.getPassword().equals(user.getPassword())){
            return new GenericResponse(false);
        }
        else {
            switch (user.getAccount_type()) {
                case "Seller": {
                    return new GenericResponse(sellerLogic.getFullSeller(user));
                }
                case "Customer": {
                    return new GenericResponse(customerLogic.getFullCustomer(user));
                }
                case "Admin": {
                    return new GenericResponse(adminLogic.getFullAdmin(user));
                }
                default: {
                    return new GenericResponse(false);
                }
            }
        }
    }
}
