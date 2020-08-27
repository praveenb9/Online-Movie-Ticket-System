package com.capg.omts.booking.model;

import java.util.List;

public class Theatre {
private int theatreId;
private String theatreName;
private String theatreCity;
private List<Integer> movies;
private List<Screen> listOfScreens;
private String managerName;
private String managerContact;

public Theatre(int theatreId, String theatreName, String theatreCity, List<Integer> movies, List<Screen> listOfScreens,
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

public Theatre() {
	
}

public int getTheatreId() {
	return theatreId;
}

public void setTheatreId(int theatreId) {
	this.theatreId = theatreId;
}

public String getTheatreName() {
	return theatreName;
}

public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}

public String getTheatreCity() {
	return theatreCity;
}

public void setTheatreCity(String theatreCity) {
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
	return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
			+ ", movies=" + movies + ", listOfScreens=" + listOfScreens + ", managerName=" + managerName
			+ ", managerContact=" + managerContact + "]";
}

}