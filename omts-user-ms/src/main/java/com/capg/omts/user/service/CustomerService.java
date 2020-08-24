package com.capg.omts.user.service;

import java.util.Arrays;
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

	
	@Override
	public List<Theater> chooseCity(String city) {
		
		
		Theater []list=restTemplate.getForObject("http://localhost:8686/theatre/getTheaters/"+city, Theater[].class);
		return Arrays.asList(list);
	}

	@Override
	public boolean bookMovieTicket(Theater theater) {
		return restTemplate.postForObject("http://localhost:8888/movie/bookTicket", theater,boolean.class);
	}

	@Override
	public boolean cancelMovieTicket(Ticket ticket) {
		try {
			 restTemplate.delete("http://localhost:8888/ticket/", ticket.getTicketId());			
			}
			catch (Exception e) {
				return false;
			}
		return true;
	}
	
	

}
