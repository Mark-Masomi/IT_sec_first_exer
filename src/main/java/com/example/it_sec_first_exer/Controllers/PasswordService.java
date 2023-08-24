package com.example.it_sec_first_exer.Controllers;

import org.springframework.stereotype.Service;
    @Service
    public class PasswordService {

        public boolean isValidPassword(String password) {
            return password != null && password.matches("(\\d{4})");
        }
    }
//\d{4}

