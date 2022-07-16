package com.myapp.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myapp")
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

}
