package com.capg.omts.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capg.omts.booking.model.Booking;

public interface BookingMovieRepository extends JpaRepository<Booking,Integer>{

	
}