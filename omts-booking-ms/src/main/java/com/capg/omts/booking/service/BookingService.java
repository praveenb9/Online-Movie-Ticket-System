package com.capg.omts.booking.service;

import java.util.List;

import com.capg.omts.booking.Exception.BookingBlockedException;
import com.capg.omts.booking.Exception.SeatNotFoundException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.Exception.TicketNotFoundException;
import com.capg.omts.booking.model.Booking;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.Ticket;

public interface BookingService {
	
	public List<Seat> chooseSeats(List<Integer> seatIds);
	public double calculateTotalCost(List<Seat> seats) throws SeatNotFoundException;
//	public Payment choosePaymentMethod(Payment payment);
//	public boolean makePayment(Payment payment,double totalCost,List<Integer>seatIds);
	
	
}