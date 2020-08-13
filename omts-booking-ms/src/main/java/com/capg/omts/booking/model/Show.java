package com.capg.omts.booking.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;

public class Show {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int showId;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
	private LocalDateTime ShowStartTime;
	@DateTimeFormat(pattern = "yyyy/MM/ddThh:mm:ss")
	private LocalDateTime ShowEndTime; 
	private String showName;
	private Movie movieName;
	private int screenId;
	private int theaterId;
	
	public Show() {
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getShowStartTime() {
		return ShowStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		ShowStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return ShowEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		ShowEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMovieName() {
		return movieName;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	
}