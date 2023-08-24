package com.example.it_sec_first_exer.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthController {


        private final PasswordService passwordService;

        @Autowired
        public AuthController(PasswordService passwordService) {
            this.passwordService = passwordService;
        }

        @PostMapping("/authenticate")
        public String authenticate(@RequestBody Login login) {

            System.out.println(login.getPassword());
            if (passwordService.isValidPassword(login.getPassword())) {
                return "Autentisering lyckades!";
            } else {
                return "Autentisering misslyckades. Ogiltigt lösenord.";
            }
        }
    }

