package com.capg.omts.movie.service;

import java.util.List;


import com.capg.omts.movie.model.Movie;
/**
 * 
 * @author Upendar_Dasri
 * version:1.0
 *
 */
public interface MovieService {
/**
 * ********This is the Interface******
 * All the Methods are declared here
 * @param movie
 * @return
 */
	
	public Movie addMovie(Movie movie); 
	public Movie updateMovie(Movie movie) ;
	public Boolean deleteMovieById(int movieId) ;
	public Movie getByMovieName(String movieName);
	public Movie getMovieById(int movieId);
	public boolean validateMovieId(int movieId) ;
	public List<Movie> findAllMovies();
		
	
}
