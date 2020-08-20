  
package com.capg.omts.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {





}