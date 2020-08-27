package com.capg.omts.booking.repository;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.omts.booking.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	Object getTicketByDateTimeAndTicketId(LocalDateTime dateTime, int ticketId);

}