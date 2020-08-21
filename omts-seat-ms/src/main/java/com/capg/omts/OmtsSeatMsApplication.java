package com.capg.omts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class OmtsSeatMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmtsSeatMsApplication.class, args);
		
	}

}
