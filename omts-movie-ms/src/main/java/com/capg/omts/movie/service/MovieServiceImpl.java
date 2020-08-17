package com.capg.omts.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.movie.model.Movie;
import com.capg.omts.movie.repository.MovieRepository;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
MovieRepository MovieRepo;
	@Override
	public Movie addMovie(Movie movie) {
		
		return MovieRepo.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie)  {
		Integer movieId = movie.getMovieId();
		if( MovieRepo.existsById(movieId))
		{ 
//     		Movie updateMovie=MovieRepo.getOne(movieId);		
		
//			updateMovie.setMovieName(movie.getMovieName());
//			updateMovie.setMovieDirector(movie.getMovieDirector());
//			updateMovie.setMovieGenre(movie.getMovieGenre());
//			updateMovie.setLanguages(movie.getLanguages());
//			updateMovie.setMovieLength(movie.getMovieLength());
//			updateMovie.setMovieReleaseDate(movie.getMovieReleaseDate());
			return MovieRepo.save(movie) ;
		}
		throw new RuntimeException ("MovieNotFound");
	}
	@Override
	public Boolean deleteMovieById(int movieId) {
		MovieRepo.deleteById(movieId);
		return true;
	}

	@Override
	public Movie getByMovieName(String movieName) {
		return MovieRepo.getByMovieName(movieName);
	}

	@Override
	public Movie getMovieById(int movieId) {
		// TODO Auto-generated method stub
		return MovieRepo.getOne(movieId);
	}

	@Override
	public List<Movie> findAllMovies() {
		// TODO Auto-generated method stub
		return MovieRepo.findAll();
	}



}
