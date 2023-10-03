package com.example.cartify.Logic;

import com.example.cartify.Model.Admin;
import com.example.cartify.Model.Input.Int_Admin;
import com.example.cartify.Model.Output.FullAdmin;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Update.Udt_Admin;
import com.example.cartify.Model.User;

import javax.ejb.Local;

@Local
public interface AdminLogicI {
    GenericResponse register (Int_Admin input);
    GenericResponse update (Udt_Admin input);
    GenericResponse delete(Integer adminId);
    GenericResponse searchCustomer (String value);
    GenericResponse searchSeller (String value);
    FullAdmin getFullAdmin (Integer userId);
    FullAdmin getFullAdmin (User user);
    FullAdmin getFullAdmin (Admin admin);
    FullAdmin getFullAdmin (Admin admin, User user);
    GenericResponse getTotalAverageRating ();
    GenericResponse getTotalSalesThisMonth ();

}
