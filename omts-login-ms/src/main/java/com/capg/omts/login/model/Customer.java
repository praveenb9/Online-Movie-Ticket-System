package com.capg.omts.login.model;

import java.time.LocalDate;
import java.util.List;



import org.springframework.format.annotation.DateTimeFormat;


public class Customer extends User{
	private int customerId;
	private String customerName;
	private String customerPassword;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dateOfBirth;

	private List<Integer> myTickets;
	private String customerContact;
	
	public Customer() {
		
	}

	public Customer(int customerId,String customerName, String customerPassword, LocalDate dateOfBirth, List<Integer> myTickets,
			String customerContact) {
		super();
		this.customerId=customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.dateOfBirth = dateOfBirth;
		this.myTickets = myTickets;
		this.customerContact = customerContact;
	}
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Integer> getMyTickets() {
		return myTickets;
	}

	public void setMyTickets(List<Integer> myTickets) {
		this.myTickets = myTickets;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", dateOfBirth=" + dateOfBirth + ", myTickets=" + myTickets + ", customerContact="
				+ customerContact + "]";
	}
	
	

}
