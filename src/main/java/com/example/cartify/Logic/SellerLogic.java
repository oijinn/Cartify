package com.example.cartify.Logic;

import com.example.cartify.DAO.SellerDAOI;
import com.example.cartify.DAO.UserDAOI;
import com.example.cartify.Model.Input.Int_Seller;
import com.example.cartify.Model.Order;
import com.example.cartify.Model.Output.FullProduct;
import com.example.cartify.Model.Output.FullSeller;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Seller;
import com.example.cartify.Model.Update.Udt_Seller;
import com.example.cartify.Model.User;

import javax.ejb.EJB;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SellerLogic {
    @EJB
    SellerDAOI sellerDAO;
    @EJB
    UserDAOI userDAO;
    @EJB
    OrderLogic orderLogic;
    @EJB
    ProductLogic productLogic;

    public GenericResponse register (Int_Seller input){
        User user = userDAO.create(input.toUser());
        if (user == null) {
            return new GenericResponse(false);
        }
        input.setUserId(user.getId());
        Seller seller = sellerDAO.create(input.toSeller());
        if (seller == null) {
            userDAO.delete(user);
            return new GenericResponse(false);
        }
        return new GenericResponse(seller);
    }
    public GenericResponse update (Udt_Seller input){
        Seller seller = sellerDAO.getSellerbyId(input.getSellerId());
        User user = userDAO.update(input.toUpdateUser(seller.getUserId()).toUser(userDAO.getUserbyId(seller.getUserId())));
        if (user == null) {
            return new GenericResponse(false);
        }else {
            Seller seller1 = sellerDAO.update(input.toSeller(seller));
            if (seller1 == null) {
                return new GenericResponse(false);
            }
            return new GenericResponse(seller1);
        }
    }
    
    public GenericResponse delete(Integer sellerId) {
        Seller seller = sellerDAO.getSellerbyId(sellerId);
        User user = userDAO.getUserbyId(seller.getUserId());
        List<Boolean> result = new ArrayList<>();
        result.add(sellerDAO.delete(seller));
        result.add(userDAO.delete(user));
        return new GenericResponse(!result.stream().anyMatch(x->!x));
    }
    public GenericResponse withdrawFromWallet (Integer sellerId, Double amount) {
        Seller seller = sellerDAO.getSellerbyId(sellerId);
        if (amount > seller.getBalance()){
            return new GenericResponse(false);
        }
        seller.setBalance(seller.getBalance() - amount);
        return new GenericResponse(sellerDAO.update(seller));
    }
    public FullSeller getFullSeller (Integer userId){
        User user = userDAO.getUserbyId(userId);
        return getFullSeller(user);
    }
    public FullSeller getFullSeller (User user){
        Seller seller = sellerDAO.findByFieldEqual("userId",user.getId()).get(0);
        return getFullSeller(seller);
    }
    public FullSeller getFullSeller (Seller seller){
        return getFullSeller(seller,userDAO.getUserbyId(seller.getUserId()));
    }
    public FullSeller getFullSeller (Seller seller, User user){
        return new FullSeller(seller,user);
    }

    public GenericResponse getSalesThisMonthSeller (Integer sellerId) {
        List<Order> orders = (List<Order>)orderLogic.findCompletedOrdersBySellerId(sellerId).getOutput();
        return new GenericResponse(orders.stream()
                .filter(x-> x.getLastUpdated().getMonth() == LocalDateTime.now().getMonth())
                .mapToDouble(x->x.getPrice())
                .sum());
    }
    public GenericResponse getAverageRatingOfSeller (Integer sellerId) {
        List<FullProduct> products = productLogic.sellerGetAllProduct(sellerId);
        return new GenericResponse(products.stream().mapToDouble(FullProduct::getAverageRating).average().orElse(0.0));
    }

}
