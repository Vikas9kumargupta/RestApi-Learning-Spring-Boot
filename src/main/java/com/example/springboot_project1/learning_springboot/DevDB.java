package com.example.springboot_project1.learning_springboot;

import com.example.springboot_project1.DB;

public class DevDB implements DB{
    public String getData(){
        return "Development Data";
    }
    
}
