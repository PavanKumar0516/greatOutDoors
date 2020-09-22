package com.capg.greatoutdoor.ordermanagement;

import java.util.Random;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class OrderManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemApplication.class, args);
	}
	@Bean
	public Random getRandomObject()
	{
	return new Random();

	}
	@Bean
	public RestTemplate getRestTemplate()
	{
	return new RestTemplate();

	}
}
