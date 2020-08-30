package com.capg.omts.user.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.omts.user.model.Movie;
import com.capg.omts.user.model.Screen;
import com.capg.omts.user.model.Show;
import com.capg.omts.user.model.Theater;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Theater addTheater(Theater theater) {
				return restTemplate.postForObject("http://localhost:8686/theatre/add", theater, Theater.class);
	}

	@Override
	public boolean deleteTheater(int theaterId) {
		
		try {
		restTemplate.delete("http://localhost:8686/theatre/delete/id/"+theaterId);
		
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public Movie addMovie(Movie movie) {
		
		System.out.println(movie);
		return restTemplate.postForObject("http://localhost:8199/movie/add", movie, Movie.class);
	}

	@Override
	public boolean deleteMovie(int movieId) {
		
		try {
			restTemplate.delete("http://localhost:8199/movie/delete/id/"+movieId);
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

	@Override
	public Screen addScreen(Screen screen) {
		
		return restTemplate.postForObject("http://localhost:8686/screen/add", screen, Screen.class);
	}

	@Override
	public boolean deleteScreen(int screenId) {
		
		try {
			restTemplate.delete("http://localhost:8686/screen/delete/id/"+screenId);
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

	@Override
	public Show addShow(Show show) {
		return restTemplate.postForObject("http://localhost:8686/show/add", show, Show.class);
	}

	@Override
	public boolean deleteShow(int showId) {
		try {
			restTemplate.delete("http://localhost:8686/show/delete/id/"+showId);
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

	@Override
	public List<Movie> getAllMovies() {
		Movie[]movieList=restTemplate.getForObject("http://localhost:8199/movie/all", Movie[].class);
		return Arrays.asList(movieList);
		
	}

}
