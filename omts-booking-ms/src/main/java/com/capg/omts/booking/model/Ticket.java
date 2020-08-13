package com.capg.omts.booking.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Ticket {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	private int noOfSeats;
	@ElementCollection
	private List<String> seatName;
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<String> getSeatName() {
		return seatName;
	}

	public void setSeatName(List<String> seatName) {
		this.seatName = seatName;
	}

	public Booking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(Booking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}