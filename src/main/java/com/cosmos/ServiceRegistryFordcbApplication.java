package com.cosmos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryFordcbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryFordcbApplication.class, args);
	}

}
