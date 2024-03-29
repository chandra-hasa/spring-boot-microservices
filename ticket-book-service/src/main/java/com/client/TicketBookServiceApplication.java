package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookServiceApplication.class, args);
	}

}
