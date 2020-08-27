package com.capg.omts.booking.model;

public class Payment {
	
	private String paymentMethod;
	private long phno;

	public Payment() {
		super();
	}
	
	public Payment(String paymentMethod, long phno) {
		super();
		this.paymentMethod = paymentMethod;
		this.phno = phno;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Payment [paymentMethod=" + paymentMethod + ", phno=" + phno + "]";
	}
	
}