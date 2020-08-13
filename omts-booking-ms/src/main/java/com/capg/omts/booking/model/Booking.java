package com.capg.omts.booking.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Booking {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private int movieId;
	private int showId;
	private Show showRef;
	
	
	private LocalDate bookingDate;
	private int transactionalId;
	private double totalCost;
	@ElementCollection
	private List<Seat> seatList;
	private Ticket ticket;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Show getShowRef() {
		return showRef;
	}

	public void setShowRef(Show showRef) {
		this.showRef = showRef;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTransactionalId() {
		return transactionalId;
	}

	public void setTransactionalId(int transactionalId) {
		this.transactionalId = transactionalId;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
}
