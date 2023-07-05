package com.example.Student.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Student.Model.student;
import com.example.Student.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public student post(student std){
        return studentRepository.save(std);
    }

    public List<student> getAllData() {
        return studentRepository.findAll();
    }
    public Optional<student> getbuId(long id){
        return studentRepository.findById(id);}

    public void delete(long id){
         studentRepository.deleteById(id);
    }
  
}
