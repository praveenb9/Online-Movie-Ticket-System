package com.capg.omts.movie.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.omts.movie.model.Movie;
/**
	* The Spring DataJpaRepository is Responsible for injecting All the Jpa And EntityManagerFactory objects
	*
	* @author   :Upendar_Dasari
	* @version  :1.0
	* @since    :12/08/2020 
**/

@Repository

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	/*   *******THIS IS SPRING DATA JPA REPOSITORY******
	 * This is Repository class which extends the JpaRepository
	 * 
	 */
	
	 public Movie getByMovieName(String movieName);
	
	
}
