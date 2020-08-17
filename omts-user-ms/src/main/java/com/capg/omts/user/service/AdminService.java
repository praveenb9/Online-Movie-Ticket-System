package com.capg.omts.user.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
				return restTemplate.postForObject("", theater, Theater.class);
	}

	@Override
	public boolean deleteTheater(int theaterId) {
		// TODO Auto-generated method stub
		try {
		restTemplate.delete("");
		
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("", movie, Movie.class);
	}

	@Override
	public boolean deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		try {
			restTemplate.delete("");
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

	@Override
	public Screen addScreen(Screen screen) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("", screen, Screen.class);
	}

	@Override
	public boolean deleteScreen(int screenId) {
		// TODO Auto-generated method stub
		try {
			restTemplate.delete("");
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

	@Override
	public Show addShow(Show show) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject("", show, Show.class);
	}

	@Override
	public boolean deleteShow(int showId) {
		// TODO Auto-generated method stub
		try {
			restTemplate.delete("");
			
			}
			catch (Exception e) {
				return false;
			}
			return true;
	}

}
