package com.capg.omts.booking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.capg.omts.booking.model.Seat;

import com.capg.omts.booking.repository.SeatRepository;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	SeatRepository seatRepo;
	@Autowired
	RestTemplate rt;
	
	//rest template for getting info from seat-ms
	@Override
	public Seat addSeat(Seat seat) {
		
		return rt.postForObject("http://seat-ms/seat/add", seat, Seat.class);
	}
	
	//method for getting available seats
	@SuppressWarnings("unchecked")
	@Override
	public List<Seat> getAvailableSeats() {
		
		return (List<Seat>) rt.getForObject("http://seat-ms/seat/all", Seat.class);
	}
}