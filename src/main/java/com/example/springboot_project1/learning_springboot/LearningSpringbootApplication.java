package com.example.springboot_project1.learning_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springboot_project1.DB;

@SpringBootApplication
public class LearningSpringbootApplication implements CommandLineRunner {

	@Autowired
	DB db;
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(db.getData());
	}
}
