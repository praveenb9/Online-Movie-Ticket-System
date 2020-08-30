package com.capg.omts.user.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

public class Theater {

	private int theatreId;
	private String theatreName;
	private String theatreCity;
	@ElementCollection
	private List<Integer> movies;
	@OneToMany
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;
	
	public Theater() {
		// TODO Auto-generated constructor stub
	}

	
	public Theater(int theatreId, String theatreName, String theatreCity, List<Integer> movies, List<Screen> listOfScreens,
			String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	

	public int gettheatreId() {
		return theatreId;
	}


	public void settheatreId(int theatreId) {
		this.theatreId = theatreId;
	}


	public String gettheatreName() {
		return theatreName;
	}

	public void settheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String gettheatreCity() {
		return theatreCity;
	}

	public void settheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
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
		return "Theater [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity + ", movies="
				+ movies + ", listOfScreens=" + listOfScreens + ", managerName=" + managerName + ", managerContact="
				+ managerContact + "]";
	}
	
}
