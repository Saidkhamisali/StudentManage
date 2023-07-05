package com.example.Student.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table( name = "Manage")

public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stId;
    private String studentName;
    private String department;
    private String address;
    private String email;
    private String password;
    


}
