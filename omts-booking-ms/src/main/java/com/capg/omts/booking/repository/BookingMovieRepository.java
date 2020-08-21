package com.capg.omts.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.omts.booking.model.Booking;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;


public interface BookingMovieRepository extends JpaRepository<Booking,Integer>{

}
	