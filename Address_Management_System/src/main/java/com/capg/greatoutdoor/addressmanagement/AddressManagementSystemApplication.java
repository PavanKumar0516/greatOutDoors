package com.capg.greatoutdoor.addressmanagement;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AddressManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressManagementSystemApplication.class, args);
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
