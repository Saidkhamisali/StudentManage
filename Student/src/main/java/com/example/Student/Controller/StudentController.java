package com.example.Student.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Model.student;
import com.example.Student.Services.StudentService;

@RestController
@RequestMapping("/api/vi")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/student")
    public ResponseEntity<?> post(@RequestBody student std){
        return ResponseEntity.ok(studentService.post(std));
    }
    @GetMapping("/student")
    public List<student> getData(){
        return studentService.getAllData();
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<?> getById(@PathVariable long id){
        return ResponseEntity.ok(studentService.getbuId(id));
    }
    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable long id){
        studentService.delete(id);
    }
   
}
