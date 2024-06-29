package com.xyz.depend_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DependServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependServiceApplication.class, args);
	}

}
