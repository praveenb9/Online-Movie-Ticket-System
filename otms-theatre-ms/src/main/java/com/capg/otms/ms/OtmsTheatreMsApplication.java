package com.capg.otms.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OtmsTheatreMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtmsTheatreMsApplication.class, args);
	}

}
