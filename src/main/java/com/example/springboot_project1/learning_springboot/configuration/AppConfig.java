package com.example.springboot_project1.learning_springboot.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.springboot_project1.DB;
import com.example.springboot_project1.learning_springboot.DevDB;
import com.example.ProdDB;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    DB getProdDBBean() {
        return new ProdDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    DB getDevDBBean() {
        return new DevDB();
    }
    
}
