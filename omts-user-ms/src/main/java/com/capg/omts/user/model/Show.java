package com.capg.omts.user.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.format.annotation.DateTimeFormat;

public class Show {

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

	
	public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, String showName, Movie movieName,
			int screenId, int theaterId) {
		super();
		this.showId = showId;
		ShowStartTime = showStartTime;
		ShowEndTime = showEndTime;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}

	

	public int getShowId() {
		return showId;
	}


	public void setShowId(int showId) {
		this.showId = showId;
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


	@Override
	public String toString() {
		return "Show [showId=" + showId + ", ShowStartTime=" + ShowStartTime + ", ShowEndTime=" + ShowEndTime
				+ ", showName=" + showName + ", movieName=" + movieName + ", screenId=" + screenId + ", theaterId="
				+ theaterId + "]";
	}
	
	
}
