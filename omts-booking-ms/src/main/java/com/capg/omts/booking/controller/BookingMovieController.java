package com.capg.omts.booking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.service.*;

@CrossOrigin
@RestController
@RequestMapping("/booking")
public class BookingMovieController {
	@Autowired
	BookingServiceImpl service;
	
	//calculating total cost
	@GetMapping("/seats")	
	public ResponseEntity<List<Seat>> calculateTotalCost(@RequestBody List<Seat> seats){
		service.calculateTotalCost(seats);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	//some put calls to choose the seats
	@PutMapping("/choose/seats")	
	public ResponseEntity<List<Seat>> chooseSeats(@RequestBody List<Integer> seatIds){
	
		return new ResponseEntity<>(service.chooseSeats(seatIds),HttpStatus.OK);
	}
	//choosing the payment method
	@PostMapping("/payment")
	public ResponseEntity<Payment> choosePaymentMethod(Payment payment) {
		return new ResponseEntity<>(service.choosePaymentMethod(payment),HttpStatus.OK);
		
	}	

}