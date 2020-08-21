package com.capg.omts.booking.service;

import java.util.List;

import com.capg.omts.booking.model.Seat;

public interface SeatService {
	
	Seat addSeat (Seat seat);
	
	List<Seat> getAvailableSeats();
	
//	 public List<Seat> bookSeats(List<Integer> seatIds);
//
//		
//	 public List<Seat> blockSeats(List<Integer> seatIds);
//
//		
//	 public List<Seat> cancelSeats(List<Integer> seatIds);
	
	
}
