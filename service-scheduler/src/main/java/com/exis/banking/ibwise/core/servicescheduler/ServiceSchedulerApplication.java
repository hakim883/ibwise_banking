package com.exis.banking.ibwise.core.servicescheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSchedulerApplication.class, args);
	}

}
