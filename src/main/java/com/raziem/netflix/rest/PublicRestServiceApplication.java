package com.raziem.netflix.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PublicRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicRestServiceApplication.class, args);
	}
}
