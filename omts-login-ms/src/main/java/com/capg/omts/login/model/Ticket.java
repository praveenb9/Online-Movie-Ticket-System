package com.capg.omts.login.model;

import java.util.List;


public class Ticket {

	private int ticketId;
	private int noOfSeats;

	private List<String> seatName;
	private Booking bookingRef;
	private boolean ticketStatus;
	private String screenName;
	
	public Ticket() {
		
	}

	
	public Ticket(int ticketId, int noOfSeats, List<String> seatName, Booking bookingRef, boolean ticketStatus,
			String screenName) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatName = seatName;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}

	

	public int getTicketId() {
		return ticketId;
	}


	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName + ", bookingRef="
				+ bookingRef + ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
	}
	
	
}
