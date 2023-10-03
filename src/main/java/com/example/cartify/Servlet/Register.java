package com.example.cartify.Servlet;

import com.example.cartify.Logic.*;
import com.example.cartify.Model.Input.Int_Customer;
import com.example.cartify.Model.Input.Int_Seller;
import com.example.cartify.Model.Output.GenericResponse;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "Register Servlet", value = "/app/Register")
public class Register extends HttpServlet {

    @EJB
    CustomerLogicI customerLogicI;

    @EJB
    SellerLogicI sellerLogicI;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try (PrintWriter out = response.getWriter()){
            String email= request.getParameter("Email");
            String password= request.getParameter("Password");
            String name = request.getParameter("Name");
            String phone= request.getParameter("Phone");
            String country= request.getParameter("Country");
            String account_type = request.getParameter("accountType");

            if(account_type.equals("Seller")){
                Int_Seller newSeller = new Int_Seller();
                newSeller.setEmail(email);
                newSeller.setPassword(password);
                newSeller.setName(name);
                newSeller.setPhone(phone);
                newSeller.setCountry(country);
                newSeller.setAccount_type(account_type);
                GenericResponse sellerProfile = sellerLogicI.register(newSeller);
                request.getRequestDispatcher("/app/Login.jsp").forward(request, response);
            } else {
                Int_Customer newCustomer = new Int_Customer();
                newCustomer.setEmail(email);
                newCustomer.setPassword(password);
                newCustomer.setName(name);
                newCustomer.setPhone(phone);
                newCustomer.setCountry(country);
                newCustomer.setAccount_type(account_type);
                GenericResponse customerProfile = customerLogicI.register(newCustomer);
                request.getRequestDispatcher("/app/Login.jsp").forward(request,response);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        processRequest(request, response);
    }
}
