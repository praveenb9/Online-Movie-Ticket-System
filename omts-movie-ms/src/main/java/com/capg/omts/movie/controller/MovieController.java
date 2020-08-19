package com.capg.omts.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.movie.Exception.MovieException;
import com.capg.omts.movie.model.Movie;
import com.capg.omts.movie.service.MovieServiceImpl;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieServiceImpl service;
	@PostMapping("/add")
	public Movie addMovie(@RequestBody Movie movie) throws MovieException {
		return service.addMovie(movie);
		
	}
	@PutMapping("/update")
	public Movie updateMovie(@RequestBody Movie movie ) throws MovieException {
	return service.updateMovie(movie);
}
	@DeleteMapping("/delete/id/{id}")
	public Boolean deleteMovieById(@PathVariable("id") int movieId) throws MovieException {
	service.deleteMovieById(movieId);
	return true;
	}
	@GetMapping("/name/{movieName}")
	public Movie getByMovieName(@PathVariable String movieName) {
	return service.getByMovieName(movieName);
	}


	@GetMapping("get/id/{id}")
	public Movie getMovieById(@PathVariable("id") int movieId) {
	
		return service.getMovieById(movieId);
	}

//public List<Movie> findMovies(){
//	List<Movie> movieList=service.findAllMovies();
//	return  List<Movie>(movieList);
//	
//}
	@GetMapping("/all")
	public List<Movie> findMovies(){
		return service.findAllMovies();
	}
	}
	
	
