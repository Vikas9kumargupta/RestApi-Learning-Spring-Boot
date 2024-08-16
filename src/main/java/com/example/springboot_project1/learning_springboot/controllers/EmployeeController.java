package com.example.springboot_project1.learning_springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//operations
//get /employees
//post /employees
//delete / employees

@RestController

public class EmployeeController {

    @GetMapping(path = "/employees")
    public String getEmployees() {
        return "Hello World";
    }
    
}
