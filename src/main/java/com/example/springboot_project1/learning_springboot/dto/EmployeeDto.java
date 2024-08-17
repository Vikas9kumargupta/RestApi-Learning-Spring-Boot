package com.example.springboot_project1.learning_springboot.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;

}
