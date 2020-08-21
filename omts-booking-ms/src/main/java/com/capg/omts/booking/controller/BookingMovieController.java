package com.capg.omts.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.booking.Exception.BookingBlockedException;
import com.capg.omts.booking.Exception.SeatNotFoundException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.model.Booking;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.Ticket;
import com.capg.omts.booking.service.*;

@RestController
@RequestMapping("/booking")
public class BookingMovieController {
	@Autowired
	BookingServiceImpl service;
	
	@GetMapping("/{seatId}")	
	public ResponseEntity<Seat> calculateTotalCost(List<Seat> seats) throws SeatNotFoundException{
		double totalcost=service.calculateTotalCost(seats);
		return new ResponseEntity<Seat>(HttpStatus.OK);
	}
	
	@GetMapping("/id/{seatId}")	
	public ResponseEntity<List<Seat>> chooseSeats(List<Integer> seatIds){
		List<Seat> blockedSeats=service.chooseSeats(seatIds);
		return new ResponseEntity<List<Seat>>(HttpStatus.OK);
	}
	
//	@GetMapping("seats")	
//	public ResponseEntity<List<Seat>> calculateTotalCost(List<Seat> seats) throws SeatNotFoundException{
//		double totalcost=service.calculateTotalCost(seats);
//		return new ResponseEntity<List<Seat>>(HttpStatus.OK);
//	}
//	
//	@GetMapping("seatId")	
//	public ResponseEntity<List<Seat>> chooseSeats(List<Integer> seatIds){
//		List<Seat> blockedSeats=service.chooseSeats(seatIds);
//		return new ResponseEntity<List<Seat>>(HttpStatus.OK);
//	}
	
//	@GetMapping("/payment/all")
//	public ResponseEntity<Payment> makePayment(@PathVariable Payment payment, double totalCost,List<Integer>seatIds){
//		//List<Payment> PaymentMethod=service.makePayment(paymentMethod,totalcost);
//		//List<Payment> list=paymentMethod.getCardNumber();
//		ResponseEntity<Payment> rt = null;
//		if(paymentMethod!=null) {
//			//service.getDetails(long cardnumber,int expmonth,int expyear,int cvc);
//			service.setCardNumber(cardnumber);
//			service.setExpMonth();
//			service.setExpYear();
//			service.setCvc();
//			rt = new ResponseEntity<Payment>(HttpStatus.OK);
//		}
//		else {
//			rt = new ResponseEntity<Payment>(HttpStatus.NOT_FOUND);
//		}
//		return rt;	
//	}
	

}