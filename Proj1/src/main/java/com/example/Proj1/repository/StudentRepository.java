package com.example.Proj1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Proj1.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Integer>{    
}