package com.kgisl.sb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class Sb2Application {


	public static void main(String[] args) {
		SpringApplication.run(Sb2Application.class, args);
	}

}
