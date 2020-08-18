package com.capg.omts.service;

import java.util.List;
import com.capg.omts.model.SeatReader;
import com.capg.omts.model.Seatlist;
import com.capg.omts.model.Seat;

public interface Seatservice {
	
	
	List<Seat> showAvailableSeats();
	
	 public List<Seat> bookSeats(Seatlist seatIds);

		
	 public List<Seat> blockSeats(Seatlist seatIds);

		
	 public List<Seat> cancelSeats(Seatlist seatIds);

	 public Seat addSeat(SeatReader seatReader);
	
	
}


