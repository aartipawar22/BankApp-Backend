package com.deloitte.bank_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;
    private String username;
    private String email;
    private String password;

    public Customer() {
    }

    public Customer(Long c_id, String username, String email, String password) {
        this.c_id = c_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "c_id=" + c_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
