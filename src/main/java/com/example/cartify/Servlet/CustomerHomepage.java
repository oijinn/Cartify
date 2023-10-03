package com.example.cartify.Servlet;

import com.example.cartify.DAO.CustomerDAOI;
import com.example.cartify.DAO.ProductDAOI;
import com.example.cartify.Logic.CustomerLogicI;
import com.example.cartify.Logic.ProductLogicI;
import com.example.cartify.Model.Output.FullProduct;
import com.example.cartify.Model.Output.GenericResponse;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.List;

@WebServlet(name = "Customer Homepage Servlet", value = "/app/CustomerHomePage")
public class CustomerHomepage extends HttpServlet {
    @EJB
    CustomerLogicI customerLogicI;

    @EJB
    ProductLogicI productLogicI;

    List<FullProduct> productList = (List<FullProduct>)productLogicI.getAllProduct().getOutput();



}
