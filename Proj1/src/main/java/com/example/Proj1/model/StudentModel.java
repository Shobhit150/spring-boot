package com.example.Proj1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
    
    @Id
    private Integer id;
    
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
