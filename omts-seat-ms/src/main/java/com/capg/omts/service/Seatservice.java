package com.capg.omts.service;

import java.util.List;
import com.capg.omts.model.SeatReader;

import com.capg.omts.model.Seat;

public interface Seatservice {
	
	
	List<Seat> getAvailableSeats();
	
	 public List<Seat> bookSeats(List<Integer> seatIds);

		
	 public List<Seat> blockSeats(List<Integer> seatIds);

		
	 public List<Seat> cancelSeats(List<Integer> seatIds);

	 public Seat addSeat(SeatReader seatReader);
	
	
}


