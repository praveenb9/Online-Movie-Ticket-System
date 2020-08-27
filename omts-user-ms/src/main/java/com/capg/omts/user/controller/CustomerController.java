package com.capg.omts.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.user.model.Theater;
import com.capg.omts.user.model.Ticket;
import com.capg.omts.user.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	ICustomerService customerService;
	
	@GetMapping("/city/{city}")
	public List<Theater> getTheaters(@PathVariable String city)
	{
	
		return customerService.chooseCity(city);
	}
	
	@PostMapping("/bookTicket")
	public boolean bookMovieTicket(@RequestBody Theater theater)
	{
		return customerService.bookMovieTicket(theater);
	}
	
	@PostMapping("/cancelTicket")
	public boolean cancelMovieTicket(@RequestBody Ticket ticket)
	{
		return customerService.cancelMovieTicket(ticket);
	}
	
	@GetMapping("/viewTheaters")
	public List<Theater> getAllTheaters()
	{
	return new ArrayList<>();
		//return customerService.chooseCity(city);
	}
}
