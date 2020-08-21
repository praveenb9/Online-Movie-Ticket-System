package com.capg.omts.booking.service;

import java.util.List;

import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.Exception.TicketNotFoundException;
import com.capg.omts.booking.model.Booking;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.Ticket;

public interface TicketService {
	
	public Ticket addTicketById(Ticket ticket);
	public Ticket showTicketById(int ticketId);


	//public Seat addBookingById(int seatId);

	public boolean cancelBookingById(int ticketId) throws TicketCancellationException;

//	public boolean cancelBookingById(int seatId) throws TicketCancellationException;


	

}