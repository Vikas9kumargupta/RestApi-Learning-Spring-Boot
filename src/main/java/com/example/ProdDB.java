package com.example;

import com.example.springboot_project1.DB;

public class ProdDB implements DB {
    public String getData(){
        return "Production Data";
    }
}
