package com.capg.omts.login.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Seat {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatId;
	private Enum seatStatus;
	private double seatPrice;
	
	public Seat() {
		// TODO Auto-generated constructor stub
	}

	public Enum getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(Enum seatStatus) {
		this.seatStatus = seatStatus;
	}

	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	
}
