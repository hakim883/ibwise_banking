package com.exis.banking.ibwise.core.servicecollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCollectorApplication.class, args);
	}

}
