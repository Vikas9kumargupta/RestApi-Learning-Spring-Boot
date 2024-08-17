package com.example.springboot_project1.learning_springboot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot_project1.learning_springboot.dto.EmployeeDto;
import com.example.springboot_project1.learning_springboot.services.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


//operations
//get /employees
//post /employees
//delete / employees

@RestController
@RequestMapping(path = "/employees")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{id}")
    public EmployeeDto getEmployeesById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.createNewEmployee(employeeDto);
    }     

    @GetMapping
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
    
}
