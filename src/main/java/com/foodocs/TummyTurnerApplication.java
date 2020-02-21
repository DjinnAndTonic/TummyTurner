package com.foodocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TummyTurnerApplication {

	public static void main(String[] args) {
//		System.out.println("Hello World");

		SpringApplication app = new SpringApplication(TummyTurnerApplication.class);
		app.run();
	}

}
