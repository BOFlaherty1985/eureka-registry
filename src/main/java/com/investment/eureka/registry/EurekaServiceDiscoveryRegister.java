package com.investment.eureka.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDiscoveryRegister {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceDiscoveryRegister.class, args);
	}

}
