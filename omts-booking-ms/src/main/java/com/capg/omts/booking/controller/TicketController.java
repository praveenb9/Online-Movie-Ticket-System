package com.capg.omts.booking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.booking.Exception.SlotNotAvailableException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.model.Ticket;
import com.capg.omts.booking.service.TicketServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketServiceImpl ticketservice;
	
	//some post methods for adding tickets
	@PostMapping("/add/all")
	public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket) throws SlotNotAvailableException{
			return new ResponseEntity<Ticket>(ticketservice.addTicket(ticket), HttpStatus.CREATED);
	}
	
	//get method for getting ticket based on ID
	@GetMapping("/id/{ticketId}")	
	public ResponseEntity<Ticket> showTicket(@PathVariable int ticketId){
		ticketservice.showTicket(ticketId);
		return new ResponseEntity<Ticket>(ticketservice.showTicket(ticketId),HttpStatus.OK);
	}	
	
	//get method for getting all the tickets
	@GetMapping("/all")
	public ResponseEntity<List<Ticket>> getAllBookings(@RequestBody Ticket ticket){
		return new ResponseEntity<List<Ticket>>(ticketservice.getAllBookings(ticket),HttpStatus.OK);
	}

	//delete method for deleting a particular ticket
	@DeleteMapping("/{ticketId}")
	public ResponseEntity<Ticket> cancelBooking(@PathVariable int ticketId) throws TicketCancellationException {
		ResponseEntity<Ticket> rt = null;
		if (ticketId!=0) {
			ticketservice.cancelBooking(ticketId);
			rt = new ResponseEntity<>(HttpStatus.OK);
		}
		else {
			rt = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return rt;
	}
	
}