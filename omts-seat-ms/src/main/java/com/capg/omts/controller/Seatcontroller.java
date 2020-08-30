/**
 	* Project Name : OnlineMovieTicket 
 	*
 	* 
**/
package com.capg.omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.model.Seat;
import com.capg.omts.model.SeatReader;
import com.capg.omts.model.Seatlist;
import com.capg.omts.model.seatStatus;
import com.capg.omts.service.Seatserviceimp;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
* The Seatcontroller  class implements  add,book,block,cancel,available seats.
*
* @author  : Kalluri Sai Santosh
* @version : 1.0
* @since   : DD-MM-YYYY 
*/

@RestController
@CrossOrigin("*")
@RequestMapping("/seat")
public class Seatcontroller {

	
	@Autowired
	Seatserviceimp seatService;
/**********************Add seat ***************************************************/
	@PostMapping("/add")
	public ResponseEntity<Seat> addSeat( @RequestBody SeatReader seatReader) {
		Seat seat=seatService.addSeat(seatReader);
		return new ResponseEntity<Seat>(seat, HttpStatus.CREATED);	
	}
/**********************Book seat *************************************************/
	@PutMapping("/book")
	@HystrixCommand(fallbackMethod = "bookSeatfallback")
	public ResponseEntity<List<Seat>> bookSeat(@RequestBody Seatlist seatIds){

		return new ResponseEntity<List<Seat>>(seatService.bookSeats(seatIds), HttpStatus.OK);
	}
/**********************show available seat *************************************************/
	
	@GetMapping("/available")
	public ResponseEntity<List<Seat>> AvailableSeats(){
		List<Seat> seats = seatService.showAvailableSeats();
		return new ResponseEntity<List<Seat>>(seats, HttpStatus.OK);
	}

/********************** Block seat *************************************************/

	@PutMapping("/block")
	public ResponseEntity<List<Seat>> blockSeat(@RequestBody Seatlist seatIds){
		return new ResponseEntity<List<Seat>>(seatService.blockSeats(seatIds), HttpStatus.OK);
	}
/**********************cancel seat *************************************************/
	
	@PutMapping("/cancel")
	public ResponseEntity<List<Seat>> cancelSeat(@RequestBody Seatlist seatIds){
		return new ResponseEntity<List<Seat>>(seatService.cancelSeats(seatIds), HttpStatus.OK);
	}


}

