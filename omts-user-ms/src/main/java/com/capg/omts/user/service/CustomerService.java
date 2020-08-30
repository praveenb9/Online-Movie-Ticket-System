package com.capg.omts.user.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.user.model.Movie;
import com.capg.omts.user.model.Theater;
import com.capg.omts.user.model.Ticket;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	RestTemplate restTemplate;

	
	@Override
	public List<Theater> chooseCity(String city) {
		
		
		Theater []list=restTemplate.getForObject("http://localhost:8686/theatre/city/"+city, Theater[].class);
		return Arrays.asList(list);
	}

	@Override
	public boolean bookMovieTicket(Ticket ticket) {
		Ticket newticket=restTemplate.postForObject("http://localhost:8888/ticket/add/all", ticket,Ticket.class);
		 if(newticket==null)
		 {
			 return false;
		 }
		 else
			 return true;
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

	@Override
	public List<Theater> getAllTheaters() {
		// TODO Auto-generated method stub
		Theater []list=restTemplate.getForObject("http://localhost:8686/theatre/all", Theater[].class);
		return Arrays.asList(list);	}

	@Override
	public List<Movie> getAllMovies() {
		
		Movie [] movieList=restTemplate.getForObject("http://localhost:8199/movie/all", Movie[].class);
		
		return Arrays.asList(movieList);
	}
	
	

}
