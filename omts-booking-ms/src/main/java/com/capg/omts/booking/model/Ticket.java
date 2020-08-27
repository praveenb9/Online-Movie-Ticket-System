package com.capg.omts.booking.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="movieticket_booking")
public class Ticket {
	@Id
	@GeneratedValue
	private int ticketId;
	private int noOfSeats;
    private String movieName;
    private String theatreName;
    private String customerName;
    private String emailId;
    private long phno;
    private String paymentMethod;
    @DateTimeFormat(pattern = "yyyy/MM/ddThh:mm")
    private LocalDateTime dateTime;
public Ticket() {
	super();
}
public Ticket(int ticketId, int noOfSeats,String movieName, String theatreName, String customerName, String emailId,
		int phno, String paymentMethod,LocalDateTime dateTime) {
	super();
	this.ticketId = ticketId;
	this.noOfSeats = noOfSeats;
	this.dateTime = dateTime;
	this.movieName = movieName;
	this.theatreName = theatreName;
	this.customerName = customerName;
	this.emailId = emailId;
	this.phno = phno;
	this.paymentMethod = paymentMethod;
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
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getTheatreName() {
	return theatreName;
}
public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
//public LocalDateTime getDateTime() {
	//return dateTime;
//}
public void setDateTime(LocalDateTime dateTime) {
	this.dateTime = dateTime;
}
@Override
public String toString() {
	return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", movieName=" + movieName + ", theatreName="
			+ theatreName + ", customerName=" + customerName + ", emailId=" + emailId + ", phno=" + phno
			+ ", paymentMethod=" + paymentMethod + ", dateTime=" + dateTime + "]";
}

}