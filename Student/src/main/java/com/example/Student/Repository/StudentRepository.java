package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Model.student;

@Repository
public interface StudentRepository extends JpaRepository<student, Long> { 
}
