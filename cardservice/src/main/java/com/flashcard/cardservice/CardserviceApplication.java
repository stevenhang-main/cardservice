package com.flashcard.cardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CardserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardserviceApplication.class, args);
	}
}
