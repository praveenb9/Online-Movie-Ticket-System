package com.capg.omts.movie.service;

import java.util.List;


import com.capg.omts.movie.model.Movie;

public interface MovieService {

	
	public Movie addMovie(Movie movie); 
	public Movie updateMovie(Movie movie) ;
	public Boolean deleteMovieById(int movieId) ;
	public Movie getByMovieName(String movieName);
	public Movie getMovieById(int movieId);
	public boolean validateMovieId(int movieId) ;
	public List<Movie> findAllMovies();
		
	
}
