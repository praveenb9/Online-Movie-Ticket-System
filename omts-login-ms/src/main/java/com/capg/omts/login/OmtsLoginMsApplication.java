package com.capg.omts.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OmtsLoginMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmtsLoginMsApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
}
