package com.capg.omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capg.omts.model.Seat;
import com.capg.omts.model.SeatReader;
import com.capg.omts.service.Seatserviceimp;


@RestController
@RequestMapping("/seat")
public class Seatcontroller {

	
	@Autowired
	Seatserviceimp seatService;
	
@PostMapping("/add")
	public ResponseEntity<Seat> addSeat( @RequestBody SeatReader seatReader) {
		Seat seat=seatService.addSeat(seatReader);
		return new ResponseEntity<Seat>(seat, HttpStatus.CREATED);	
	}

	@PutMapping("/book")
	public ResponseEntity<List<Seat>> bookSeat(@RequestBody List<Integer> seatIds){

		return new ResponseEntity<List<Seat>>(seatService.bookSeats(seatIds), HttpStatus.OK);
	}
	@GetMapping("/available")
	public ResponseEntity<List<Seat>> AvailableSeats(){
		List<Seat> seats = seatService.showAvailableSeats();
		return new ResponseEntity<List<Seat>>(seats, HttpStatus.OK);
	}


	
	
	

}

