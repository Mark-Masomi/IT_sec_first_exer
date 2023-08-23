package com.example.it_sec_first_exer.Controllers;

import org.springframework.stereotype.Service;
public class PassService {

    @Service
    public class PasswordService {

        public boolean isValidPassword(String password) {
            // Kolla om lösenordet består av exakt 4 siffror
            return password != null && password.matches("\\d{4}");
        }
    }

}
