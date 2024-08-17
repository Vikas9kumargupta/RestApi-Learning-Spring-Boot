package com.example.springboot_project1.learning_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_project1.learning_springboot.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
