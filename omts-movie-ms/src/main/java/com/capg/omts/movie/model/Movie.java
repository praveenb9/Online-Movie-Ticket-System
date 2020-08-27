package com.capg.omts.movie.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
/**
	* The Model Class describes about the Attributes of the Module
	*
	* @author   :Upendar_Dasari
	* @version  :1.0
	* @since    :11/08/2020
**/

@Entity
public class Movie {
	/**This class describe about all the Attributes that are used in Movie Module
	 * All the setters and getters are created for Attributes
	 * Also created constructor using Fields
	 * And also created Generate to string...
	 */
	@Id
	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieDirector;
	private int movieLength;
	@ElementCollection
	//@CollectionTable(name = "Movie")
	private List<String> languages;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate movieReleaseDate;
	
	public Movie() {
		
	}
	

	public Movie(int movieId, String movieName, String movieGenre, String movieDirector, int movieLength,
			List<String> languages, LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}


	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieDirector=" + movieDirector + ", movieLength=" + movieLength + ", languages=" + languages
				+ ", movieReleaseDate=" + movieReleaseDate + "]";
	}
	
	
}
