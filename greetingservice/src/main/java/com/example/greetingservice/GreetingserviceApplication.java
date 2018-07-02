package com.example.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GreetingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingserviceApplication.class, args);
	}
}
