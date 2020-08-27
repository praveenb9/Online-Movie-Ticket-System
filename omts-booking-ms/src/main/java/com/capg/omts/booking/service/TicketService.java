package com.capg.omts.booking.service;

import java.util.List;

import com.capg.omts.booking.Exception.SlotNotAvailableException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.model.Ticket;

public interface TicketService {
	
	public Ticket addTicket(Ticket ticket) throws SlotNotAvailableException;
	
	public Ticket showTicket(int ticketId);
    
	public List<Ticket> getAllBookings(Ticket ticket);

	public boolean cancelBooking(int ticketId) throws TicketCancellationException;
	
	

}