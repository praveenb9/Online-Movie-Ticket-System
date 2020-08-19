package com.capg.omts.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.omts.movie.Exception.MovieException;
import com.capg.omts.movie.model.Movie;

public interface MovieService {

	
	public Movie addMovie(Movie movie) throws MovieException;
	public Movie updateMovie(Movie movie) throws MovieException;
	public Boolean deleteMovieById(int movieId) throws MovieException;
	public Movie getByMovieName(String movieName);
	public Movie getMovieById(int movieId);

	public List<Movie> findAllMovies();
		
	
}
