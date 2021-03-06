package com.capg.omts.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omts.movie.Exception.MovieException;
import com.capg.omts.movie.model.Movie;
import com.capg.omts.movie.repository.MovieRepository;

/**
	* The LoginController class Do the Authentication of A User
	*
	* @author   :Upendar_Dasari
	* @version  :1.0
	* @since    :YYYY-MM-DD 
**/

@Service 
public class MovieServiceImpl implements MovieService {
	@Autowired
MovieRepository MovieRepo;
	@Override
	public Movie addMovie(Movie movie)  {
		Integer movieId =movie.getMovieId();
		if(!MovieRepo.existsById(movieId)) {
		return MovieRepo.save(movie);
		}
		else {
			throw new MovieException("Movie Alredy added");
		}
	}

	@Override
	public Movie updateMovie(Movie movie)  {
		Integer movieId = movie.getMovieId();
		if( MovieRepo.existsById(movieId))
		{ 

			return MovieRepo.save(movie) ;
		}
		throw new RuntimeException ("MovieNotFound");
	}
	@Override
	public Boolean deleteMovieById(int movieId)  {
		if(MovieRepo.existsById(movieId)){
			MovieRepo.deleteById(movieId);
		}
		else {
			throw new MovieException("Movie Already Deleted or Movie Not Found");
			
		}
		return true;
	}

	
	@Override
	public Movie getByMovieName(String movieName) {
		return MovieRepo.getByMovieName(movieName);
	}

	@Override
	public Movie getMovieById(int movieId) {
		
		return MovieRepo.getOne(movieId);
	}


	@Override
	public List<Movie> findAllMovies() {
		
		return MovieRepo.findAll();
	}

	@Override
	public boolean validateMovieId(int movieId)  {
		String movie = Integer.toString(movieId);
		if (!(movie.length() >= 4 && movie.charAt(0)=='3')) {
			throw new MovieException("MovieId must be minimum of 4 characters starting with 3");
		}
		return true;

	}
}
