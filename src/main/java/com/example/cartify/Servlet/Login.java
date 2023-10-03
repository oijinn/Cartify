package com.example.cartify.Servlet;

import com.example.cartify.Logic.UserLogicI;
import com.example.cartify.Model.Input.Int_Userlogin;
import com.example.cartify.Model.Output.FullAdmin;
import com.example.cartify.Model.Output.FullCustomer;
import com.example.cartify.Model.Output.FullSeller;
import com.example.cartify.Model.Output.GenericResponse;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "Login Servlet", value = "/app/login")

public class Login extends HttpServlet {

    @EJB
    UserLogicI userLogicI;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try (PrintWriter out = response.getWriter()){
            String email = request.getParameter("Email");
            String password = request.getParameter("Password");

            Int_Userlogin int_userlogin = new Int_Userlogin();
            int_userlogin.setEmail(email);
            int_userlogin.setEmail(password);
            GenericResponse res = userLogicI.login(int_userlogin);
            request.getSession().setAttribute("user", res.getOutput());

            if (res.getOutput() instanceof FullCustomer){
                request.getRequestDispatcher("/CustomerHomePage.jsp").forward(request,response);

            }

            if (res.getOutput() instanceof FullSeller){
                request.getRequestDispatcher("/SellerHomePage.jsp").forward(request,response);

            }

            if (res.getOutput() instanceof FullAdmin){
                request.getRequestDispatcher("/AdminHomePage.jsp").forward(request,response);

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
