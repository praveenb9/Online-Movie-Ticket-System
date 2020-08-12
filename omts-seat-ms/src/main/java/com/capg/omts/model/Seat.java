package com.capg.omts.model;

import javax.persistence.Table;

public class Seat {
	

	private int seatId;
	
	private Enum seatStatus;

	private double seatPrice;

	public int getSeatId() {
		return seatId;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(int seatId, Enum seatStatus, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatStatus = seatStatus;
		this.seatPrice = seatPrice;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
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

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatStatus=" + seatStatus + ", seatPrice=" + seatPrice + "]";
	}
	}
	





