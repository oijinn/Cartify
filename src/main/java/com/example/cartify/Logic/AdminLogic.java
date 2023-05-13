package com.example.cartify.Logic;

import com.example.cartify.DAO.*;
import com.example.cartify.Model.Admin;
import com.example.cartify.Model.Input.Int_Admin;
import com.example.cartify.Model.Order;
import com.example.cartify.Model.Output.FullAdmin;
import com.example.cartify.Model.Output.FullProduct;
import com.example.cartify.Model.Output.GenericResponse;
import com.example.cartify.Model.Update.Udt_Admin;
import com.example.cartify.Model.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Stateless

public class AdminLogic {
    @EJB
    AdminDAOI adminDAO;
    @EJB
    UserDAOI userDAO;
    @EJB
    CustomerDAOI customerDAO;
    @EJB
    SellerDAOI sellerDAO;
    @EJB
    ProductDAOI productDAO;
    @EJB
    ProductLogic productLogic;
    @EJB
    OrderLogic orderLogic;

    public GenericResponse register (Int_Admin input){
        User user = userDAO.create(input.toUser());
        if (user == null) {
            return new GenericResponse(false);
        }
        input.setUserId(user.getId());
        Admin admin = adminDAO.create(input.toAdmin());
        if (admin == null) {
            userDAO.delete(user);
            return new GenericResponse(false);
        }
        return new GenericResponse(admin);
    }
    public GenericResponse update (Udt_Admin input){
        Admin admin = adminDAO.getAdminbyId(input.getAdminId());
        User user = userDAO.update(input.toUpdateUser(admin.getUserId()).toUser(userDAO.getUserbyId(admin.getUserId())));
        if (user == null) {
            return new GenericResponse(false);
        }else {
            Admin admin1 = adminDAO.update(input.toAdmin(admin));
            if (admin1 == null) {
                return new GenericResponse(false);
            }
            return new GenericResponse(admin1);
        }
    }

    public GenericResponse delete(Integer adminId) {
        Admin admin = adminDAO.getAdminbyId(adminId);
        User user = userDAO.getUserbyId(admin.getUserId());
        List<Boolean> result = new ArrayList<>();
        result.add(adminDAO.delete(admin));
        result.add(userDAO.delete(user));
        return new GenericResponse(!result.stream().anyMatch(x->!x));
    }
    public GenericResponse searchCustomer (String value){
        return new GenericResponse(customerDAO.searchCustomer(value));
    }
    public GenericResponse searchSeller (String value) {
        return new GenericResponse(sellerDAO.searchSeller(value));
    }

    public FullAdmin getFullAdmin (Integer userId){
        User user = userDAO.getUserbyId(userId);
        return getFullAdmin(user);
    }
    public FullAdmin getFullAdmin (User user){
        Admin admin = adminDAO.findByFieldEqual("userId",user.getId()).get(0);
        return getFullAdmin(admin);
    }
    public FullAdmin getFullAdmin (Admin admin){
        return getFullAdmin(admin,userDAO.getUserbyId(admin.getUserId()));
    }
    public FullAdmin getFullAdmin (Admin admin, User user){
        return new FullAdmin(admin,user);
    }
    public GenericResponse getTotalAverageRating () {
        List<FullProduct> products = productDAO.getAllProduct().stream().map(x-> productLogic.getFullProduct(x)).collect(Collectors.toList());
        return new GenericResponse(products.stream().mapToDouble(FullProduct::getAverageRating).average().orElse(0.0));
    }
    public GenericResponse getTotalSalesThisMonth () {
        List<Order> orders = orderLogic.findAllCompletedOrders();
        return new GenericResponse(orders.stream()
                .filter(x-> x.getLastUpdated().getMonth() == LocalDateTime.now().getMonth())
                .mapToDouble(x->x.getPrice())
                .sum());
    }
}
