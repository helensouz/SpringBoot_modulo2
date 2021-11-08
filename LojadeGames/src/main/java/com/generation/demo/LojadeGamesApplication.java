package com.generation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

 @EntityScan(basePackages = "com.generation.model")

@SpringBootApplication
public class LojadeGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojadeGamesApplication.class, args);
	}

}
