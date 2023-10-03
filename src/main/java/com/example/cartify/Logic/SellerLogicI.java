package com.example.cartify.Logic;

import com.example.cartify.Model.Input.Int_Seller;
import com.example.cartify.Model.Output.FullSeller;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Seller;
import com.example.cartify.Model.Update.Udt_Seller;
import com.example.cartify.Model.User;

import javax.ejb.Local;

@Local
public interface SellerLogicI {
    GenericResponse register (Int_Seller input);
    GenericResponse update (Udt_Seller input);
    GenericResponse delete(Integer sellerId);
    GenericResponse withdrawFromWallet (Integer sellerId, Double amount);
    FullSeller getFullSeller (Integer userId);
    FullSeller getFullSeller (User user);
    FullSeller getFullSeller (Seller seller);
    FullSeller getFullSeller (Seller seller, User user);
    GenericResponse getSalesThisMonthSeller (Integer sellerId);
    GenericResponse getAverageRatingOfSeller (Integer sellerId);
}
