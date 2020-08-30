package com.capg.omts.user.service;

import java.util.List;

import com.capg.omts.user.model.Movie;
import com.capg.omts.user.model.Screen;
import com.capg.omts.user.model.Show;
import com.capg.omts.user.model.Theater;

public interface IAdminService {

	public Theater addTheater(Theater theater);
	public boolean deleteTheater(int theaterId);
	public Movie addMovie(Movie movie);
	public boolean deleteMovie(int movieId);
	public Screen addScreen(Screen screen);
	public boolean deleteScreen(int screenId);
	public Show addShow(Show show);
	public boolean deleteShow(int showId);
	public List<Movie> getAllMovies();
}
