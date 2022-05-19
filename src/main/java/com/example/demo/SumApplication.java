package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SumApplication.class, args);
		
		int a=10,b=20;
		System.out.println(a+b);
	}

}
