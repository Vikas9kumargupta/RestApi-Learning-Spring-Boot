package com.example.springboot_project1.learning_springboot.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_project1.learning_springboot.dto.EmployeeDto;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestParam;



//operations
//get /employees
//post /employees
//delete / employees

@RestController

public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
    public EmployeeDto getEmployees(@PathVariable("id") Long employeeId) {

        return new EmployeeDto(employeeId, "Vikas Gupta", LocalDate.of(2022, 05,01),true);
    }

    @GetMapping(path="/employees")
    public String getData(@PathParam("sortBy") String sortBy, @PathParam("Limit") Integer limit) {
        return "Hello "+sortBy + " "+ limit;
    }     
}
