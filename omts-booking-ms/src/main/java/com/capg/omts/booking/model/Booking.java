package com.capg.omts.booking.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {

private int bookingId;
private int movieId;
private int showId;
private LocalDate bookingDate;
private int transactionId;
@Id
private double totalCost;
@ElementCollection
private List<Integer> seatList;

public Booking() {
	
}

public Booking(int bookingId, int movieId, int showId, LocalDate bookingDate, int transactionId,
		double totalCost, List<Integer> seatList) {
	super();
	this.bookingId = bookingId;
	this.movieId = movieId;
	this.showId = showId;
	this.bookingDate = bookingDate;
	this.transactionId = transactionId;
	this.totalCost = totalCost;
	this.seatList = seatList;

}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
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
public LocalDate getBookingDate() {
	return bookingDate;
}
public void setBookingDate(LocalDate bookingDate) {
	this.bookingDate = bookingDate;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
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

@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", movieId=" + movieId + ", showId=" + showId + ", bookingDate=" + bookingDate + ", transactionId=" + transactionId + ", totalCost=" + totalCost
			+ ", seatList=" + seatList + "]";
}

}