package com.capg.omts.user.service;

import java.util.List;

import com.capg.omts.user.model.Movie;
import com.capg.omts.user.model.Theater;
import com.capg.omts.user.model.Ticket;

public interface ICustomerService {

	public List<Theater> chooseCity(String city);
	public boolean bookMovieTicket(Ticket ticket);
	public boolean cancelMovieTicket(Ticket ticket);
	public List<Theater> getAllTheaters();
	public List<Movie> getAllMovies();
}
