package com.faidterence.social_login_oauth2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public String home() {
        return  "Welcome to Social Login Oauth2!";
    }

    @GetMapping("/secured")
    public String secured() {
        return  "Thanks for logging in!";
    }
}
