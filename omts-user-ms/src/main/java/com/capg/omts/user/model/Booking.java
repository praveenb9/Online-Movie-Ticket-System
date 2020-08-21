package com.capg.omts.user.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;

public class Booking {

	private int bookingId;
	private int movieId;
	private int showId;
	private Show showRef;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
	private LocalDate bookingDate;
	private int transactionalId;
	private double totalCost;
	@ElementCollection
	private List<Integer> seatList;
	private Ticket ticket;
	
	public Booking() {
		
	}

	
	public Booking(int bookingId, int movieId, int showId, Show showRef, LocalDate bookingDate, int transactionalId,
			double totalCost, List<Integer> seatList, Ticket ticket) {
		super();
		this.bookingId = bookingId;
		this.movieId = movieId;
		this.showId = showId;
		this.showRef = showRef;
		this.bookingDate = bookingDate;
		this.transactionalId = transactionalId;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.ticket = ticket;
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

	public List<Integer> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Integer> seatList) {
		this.seatList = seatList;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", showRef="
				+ showRef + ", bookingDate=" + bookingDate + ", transactionalId=" + transactionalId + ", totalCost="
				+ totalCost + ", seatList=" + seatList + ", ticket=" + ticket + "]";
	}
	
	
}
