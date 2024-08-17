package com.example.springboot_project1.learning_springboot.services;

import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.booleanThat;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_project1.learning_springboot.dto.EmployeeDto;
import com.example.springboot_project1.learning_springboot.entities.EmployeeEntity;
import com.example.springboot_project1.learning_springboot.repositories.EmployeeRepository;

@Service
public class EmployeeService {


    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper){
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    public EmployeeDto getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return modelMapper.map(employeeEntity, EmployeeDto.class);
    }
    

    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDto.class); 
    }


    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository
                .findAll()
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class))
                .collect(Collectors.toList());     
    }


    public boolean deleteEmployeeById(Long id) {
        boolean isPresent = employeeRepository.existsById(id);
        if(!isPresent) return false;
        employeeRepository.deleteById(id);
        return true;
    }
}
