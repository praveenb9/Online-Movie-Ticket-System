package com.capg.omts.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.Exception.TicketNotFoundException;
import com.capg.omts.booking.model.Booking;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.Ticket;
import com.capg.omts.booking.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
    TicketRepository ticketRepo;
	
//	List<Seat> seats;

	@Override
	public Ticket showTicketById(int ticketId) {
		// TODO Auto-generated method stub
		return ticketRepo.getOne(ticketId);
	}
	
	@Override
	public Ticket addTicketById(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepo.save(ticket);
	}
	
//	@Override
//	public Seat addBookingById(int seatId) {
//		return ticketRepo.save(seatId);
//		
//	}

	@Override
	public boolean cancelBookingById(int ticketId) throws TicketCancellationException {

		//boolean flag = false;
		if (ticketRepo.existsById(ticketId)) 
		{
			ticketRepo.deleteById(ticketId);
		}
		else {
			throw new TicketCancellationException("Cancellation Failed : Id not found");
		}
		return true;

	}

}