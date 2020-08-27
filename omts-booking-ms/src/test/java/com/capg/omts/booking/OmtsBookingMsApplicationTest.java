package com.capg.omts.booking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.capg.omts.booking.MmsBookingApplication;
import com.capg.omts.booking.controller.TicketController;
import com.capg.omts.booking.repository.TicketRepository;
import com.capg.omts.booking.service.TicketServiceImpl;

@SpringBootTest(classes = MmsBookingApplication.class)

class OmtsBookingMsApplicationTest {


	@Autowired
	TicketServiceImpl ticketservice;
	@Autowired
	TicketRepository ticketRepo;
	@Autowired
	TicketController showticket;

	@Test
	void testGetAllBookings() {
		assertEquals(true, !ticketRepo.findAll().isEmpty());
	}
}
