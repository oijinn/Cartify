package com.example.cartify.Model;

import javax.persistence.*;

import java.io.Serializable;

/**
 *
 * @author 60112
 */
@Entity
@Table(schema = "EPDA")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Email;
    private String Password;
    private String Account_type;

    public User( String Email, String Password, String Account_type) {
        this.Email = Email;
        this.Password = Password;
        this.Account_type = Account_type;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAccount_type() {
        return Account_type;
    }

    public void setAccount_type(String account_type) {
        Account_type = account_type;
    }
}
