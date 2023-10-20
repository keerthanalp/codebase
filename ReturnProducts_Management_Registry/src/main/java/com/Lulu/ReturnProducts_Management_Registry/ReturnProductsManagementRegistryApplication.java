package com.Lulu.ReturnProducts_Management_Registry;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ReturnProductsManagementRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnProductsManagementRegistryApplication.class, args);
	}

}
