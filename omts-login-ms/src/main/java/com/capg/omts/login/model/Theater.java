package com.capg.omts.login.model;

import java.util.List;


public class Theater {

	private int theaterId;
	private String theaterName;
	private String city;
	private List<Integer> movies;
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;
	
	public Theater() {
		
	}

	
	public Theater(int theaterId, String theaterName, String city, List<Integer> movies, List<Screen> listOfScreens,
			String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.city = city;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	

	public int getTheaterId() {
		return theaterId;
	}


	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
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

	public List<Integer> getMovies() {
		return movies;
	}

	public void setMovies(List<Integer> movies) {
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


	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", city=" + city + ", movies="
				+ movies + ", listOfScreens=" + listOfScreens + ", managerName=" + managerName + ", managerContact="
				+ managerContact + "]";
	}
	
}
