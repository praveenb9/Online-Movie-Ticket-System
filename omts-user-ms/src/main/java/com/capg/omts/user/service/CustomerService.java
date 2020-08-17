package com.capg.omts.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.user.model.Theater;
import com.capg.omts.user.model.Ticket;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	RestTemplate restTemplate;

	//@SuppressWarnings("unchecked")
	@Override
	public List<Theater> chooseCity(String city) {
		
		return restTemplate.getForObject("", List.class);
	}

	@Override
	public boolean bookMovieTicket(Theater theater) {
		return restTemplate.postForObject("", theater,boolean.class);
	}

	@Override
	public boolean cancelMovieTicket(Ticket ticket) {
		return restTemplate.postForObject("", ticket,boolean.class);
	}
	
	

}
