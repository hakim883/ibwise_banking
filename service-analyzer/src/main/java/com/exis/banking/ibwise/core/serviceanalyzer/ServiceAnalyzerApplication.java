package com.exis.banking.ibwise.core.serviceanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAnalyzerApplication.class, args);
	}

}
