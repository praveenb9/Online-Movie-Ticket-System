package com.capg.omts.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.movie.model.Movie;
import com.capg.omts.movie.service.MovieServiceImpl;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	MovieServiceImpl service;
	@GetMapping("/add")
	public Movie addMovie(@RequestBody Movie movie) {
		return service.addMovie(movie);
		
	}
	@PutMapping("/update")
	public Movie updateMovie(@RequestBody Movie movie ) {
	return service.updateMovie(movie);
}
	@DeleteMapping("/movie/id/{id}")
	public Boolean deleteMovieById(int movieId) {
	service.deleteMovieById(movieId);
	return true;
	}
	@GetMapping("/movie/name/{movieName}")
	public Movie getByMovieName(@PathVariable String movieName) {
		return service.getByMovieName(movieName);
	}


	@GetMapping("movie/id/{id}")
	public Movie getMovieById(@PathVariable("id") int movieId) {
	
		return service.getMovieById(movieId);
	}


	
	}
	
