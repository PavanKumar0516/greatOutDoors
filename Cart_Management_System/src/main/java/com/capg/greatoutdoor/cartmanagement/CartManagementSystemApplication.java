package com.capg.greatoutdoor.cartmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CartManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartManagementSystemApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplateObject() {
		return new RestTemplate();
	}
}
