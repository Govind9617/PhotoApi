package com.grt.photappapiuser.userapiservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableDiscoveryClient
public class UserapiServiceApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(UserapiServiceApplication.class, args);
	}

}
