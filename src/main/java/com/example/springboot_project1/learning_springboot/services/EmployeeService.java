package com.example.springboot_project1.learning_springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_project1.learning_springboot.dto.EmployeeDto;
import com.example.springboot_project1.learning_springboot.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDto getEmployeeById(Long id){
        return null;
    }
}
