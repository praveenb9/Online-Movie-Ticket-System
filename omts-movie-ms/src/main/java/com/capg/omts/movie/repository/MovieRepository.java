package com.capg.omts.movie.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.omts.movie.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	@Autowired
	public Movie getByMovieName(String movieName);
	
	
}
