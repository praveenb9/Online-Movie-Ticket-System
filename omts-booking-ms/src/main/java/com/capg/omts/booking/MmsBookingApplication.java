package com.capg.omts.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MmsBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmsBookingApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CorsFilter corsFilter() {

		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		final CorsConfiguration config = new CorsConfiguration();

		config.setAllowCredentials(true);

		config.addAllowedOrigin("*");

		config.addAllowedHeader("*");

		config.addAllowedMethod("OPTIONS");

		config.addAllowedMethod("HEAD");

		config.addAllowedMethod("GET");

		config.addAllowedMethod("PUT");

		config.addAllowedMethod("POST");

		config.addAllowedMethod("DELETE");

		config.addAllowedMethod("PATCH");

		source.registerCorsConfiguration("/**", config);

		return new CorsFilter(source);

	}
}