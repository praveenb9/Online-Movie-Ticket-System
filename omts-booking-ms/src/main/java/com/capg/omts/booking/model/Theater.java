package com.capg.omts.booking.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Theater {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int theaterId;
	private String theaterName;
	private String city;
	@ElementCollection
	private List<Movie> movies;
	@ElementCollection
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;
	
	public Theater() {
		// TODO Auto-generated constructor stub
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
}