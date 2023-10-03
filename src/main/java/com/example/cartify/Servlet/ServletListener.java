package com.example.cartify.Servlet;

import com.example.cartify.Utilities.DataSource;

import javax.persistence.EntityManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
@WebListener
public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        // Code to execute when the application starts (optional)
        EntityManager em = DataSource.getEntityManager().createEntityManager();
        System.out.println("************** Starting up! **************");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
//        System.out.println("************** Shutting down! **************");
//        System.out.println("Destroying Context...");
//        System.out.println("Calling MySQL AbandonedConnectionCleanupThread checkedShutdown");
//        ClassLoader cl = Thread.currentThread().getContextClassLoader();
//
//        Enumeration<Driver> drivers = DriverManager.getDrivers();
//        while (drivers.hasMoreElements()) {
//            Driver driver = drivers.nextElement();
//
//            if (driver.getClass().getClassLoader() == cl) {
//                try {
//                    System.out.println("Deregistering JDBC driver {}");
//                    DriverManager.deregisterDriver(driver);
//
//                } catch (SQLException ex) {
//                    System.out.println("Error deregistering JDBC driver {}");
//                    ex.printStackTrace();
//                }
//            } else {
//                System.out.println("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader");
//            }
        try {
            // Unregister the JDBC driver
            java.sql.Driver driver = DriverManager.getDriver("jdbc:postgresql://localhost:5432/");
            DriverManager.deregisterDriver(driver);
            System.out.println("PostgreSQL JDBC driver unregistered successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
