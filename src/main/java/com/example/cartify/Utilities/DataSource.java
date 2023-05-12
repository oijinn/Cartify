package com.example.cartify.Utilities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSource {
    @Bean("emf")
    public EntityManagerFactory emf(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PG_DB");
        return emf;
    }
}
