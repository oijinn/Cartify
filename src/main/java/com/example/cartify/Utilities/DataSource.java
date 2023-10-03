package com.example.cartify.Utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class DataSource {
    public static EntityManagerFactory getEntityManager(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PG_DB");
        return emf;
    }
}
