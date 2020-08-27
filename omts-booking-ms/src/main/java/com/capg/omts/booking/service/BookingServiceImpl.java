package com.capg.omts.booking.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capg.omts.booking.model.Payment;
import com.capg.omts.booking.model.Seat;
import com.capg.omts.booking.repository.*;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
    BookingMovieRepository bookingmovieRepo;
	
    List<Seat> seats;
	
	@Autowired
	RestTemplate rt;

	//using rest template and getting info from seat-ms
	@Override
	public List<Seat> chooseSeats(List<Integer> seatIds) {
		
		rt.put("http://seat-ms/seat/block", seatIds);
		Seat[] blockedSeats=rt.getForObject("http://seat-ms/seat/block",Seat[].class);
		return Arrays.asList(blockedSeats);
	}

	//method for calculating total cost
	@Override
	public double calculateTotalCost(List<Seat> seats) {
		return seats.stream().mapToDouble(s->s.getSeatPrice()).sum();
	}

	//method returning the payment method
	@Override
	public Payment choosePaymentMethod(Payment payment) {
		
		return payment;
	}

}