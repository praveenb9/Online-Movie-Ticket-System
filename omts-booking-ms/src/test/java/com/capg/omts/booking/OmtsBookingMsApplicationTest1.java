package com.capg.omts.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.omts.booking.Exception.SlotNotAvailableException;
import com.capg.omts.booking.Exception.TicketCancellationException;
import com.capg.omts.booking.model.Ticket;
import com.capg.omts.booking.service.TicketServiceImpl;


@SpringBootTest
class omtsBookingApplicationTest1 {

    @Autowired
	TicketServiceImpl ticketservice;
    
    Ticket ticket;
	Ticket ticket1;
	
	@BeforeEach
	public void setUp() {

		ticket = new Ticket(45698,3,"Jaanu","Raj Theatres","Vasu","vasu@gmail.com",998877,"paytm",LocalDateTime.of(2020, 5, 9, 9, 30));
		
	}

	@Test
	public void testAddTicket() throws SlotNotAvailableException {
	Ticket newTicket=ticketservice.addTicket(ticket);
        assertEquals(true,ticketservice.showTicket(newTicket.getTicketId())!=null);
	}

	
}