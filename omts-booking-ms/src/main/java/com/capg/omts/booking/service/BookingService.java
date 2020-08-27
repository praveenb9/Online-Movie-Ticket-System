package com.capg.omts.booking.service;

import java.util.List;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;

public interface BookingService {
	
	public List<Seat> chooseSeats(List<Integer> seatIds);
	
	public double calculateTotalCost(List<Seat> seats);
	
	public Payment choosePaymentMethod(Payment payment);	
	
}