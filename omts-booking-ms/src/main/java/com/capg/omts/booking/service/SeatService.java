package com.capg.omts.booking.service;

import java.util.List;
import com.capg.omts.booking.model.Seat;

public interface SeatService {
	
	Seat addSeat (Seat seat);
	
	List<Seat> getAvailableSeats();	
	
}