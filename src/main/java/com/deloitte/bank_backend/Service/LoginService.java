package com.deloitte.bank_backend.Service;

import com.deloitte.bank_backend.Entity.Customer;
import com.deloitte.bank_backend.Repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer login(String email, String password) {
        Customer customer = customerRepository.findByEmail(email);


        if (customer != null && customer.getPassword().equals(password)) {
            return customer;
        }
        return null;
    }
}

