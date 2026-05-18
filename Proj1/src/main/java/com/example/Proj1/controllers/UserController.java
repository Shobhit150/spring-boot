package com.example.Proj1.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.Proj1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

    @Autowired
    UserService s1;

    @GetMapping("/user")
    public String getUseString() {
        return s1.getHi();
    }
    
}
