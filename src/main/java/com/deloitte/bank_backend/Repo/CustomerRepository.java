package com.deloitte.bank_backend.Repo;



import com.deloitte.bank_backend.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}

