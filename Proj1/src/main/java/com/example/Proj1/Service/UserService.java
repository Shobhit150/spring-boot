package com.example.Proj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Proj1.repository.StudentRepository;

@Service
public class UserService {

    private final StudentRepository repo;

    public UserService(StudentRepository repo) {
        this.repo = repo;
    }

    public String getHi() {
        return "Hi";
    }

    public 


}
