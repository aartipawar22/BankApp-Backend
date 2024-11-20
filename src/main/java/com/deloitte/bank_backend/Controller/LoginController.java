package com.deloitte.bank_backend.Controller;

import com.deloitte.bank_backend.Entity.Customer;
import com.deloitte.bank_backend.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String password = request.get("password");
        System.out.println(email);
        Customer customer = loginService.login(email, password);

        if (customer != null) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(400).body("Invalid credentials");
        }
    }
}

