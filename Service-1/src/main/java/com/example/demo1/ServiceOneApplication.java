package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOneApplication {

	public static void main(String[] args) {
        System.out.println("Start service...");
		SpringApplication.run(ServiceOneApplication.class, args);		
		System.out.println(" started");

		System.out.println("Open your browser on http://localhost:8080");
	}
}
