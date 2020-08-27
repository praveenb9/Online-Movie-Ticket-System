package com.capg.omts.booking.model;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
private int showId;
private LocalDateTime showStartTime;
private LocalDateTime showEndTime;
private List<Integer> seats;
private int movieId;
private int screenId;
private int theatreId;
public Show() {
	super();
}
public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, List<Integer> seats,int movieId,
		int screenId, int theatreId) {
	super();
	this.showId = showId;
	this.showStartTime = showStartTime;
	this.showEndTime = showEndTime;
	this.seats = seats;
	this.movieId = movieId;
	this.screenId = screenId;
	this.theatreId = theatreId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public LocalDateTime getShowStartTime() {
	return showStartTime;
}
public void setShowStartTime(LocalDateTime showStartTime) {
	this.showStartTime = showStartTime;
}
public LocalDateTime getShowEndTime() {
	return showEndTime;
}
public void setShowEndTime(LocalDateTime showEndTime) {
	this.showEndTime = showEndTime;
}
public List<Integer> getSeats() {
	return seats;
}
public void setSeats(List<Integer> seats) {
	this.seats = seats;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getScreenId() {
	return screenId;
}
public void setScreenId(int screenId) {
	this.screenId = screenId;
}
public int getTheatreId() {
	return theatreId;
}
public void setTheatreId(int theatreId) {
	this.theatreId = theatreId;
}
@Override
public String toString() {
	return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime + ", seats="
			+ seats + ", movieId=" + movieId + ", screenId=" + screenId + ", theatreId="
			+ theatreId + "]";
}

}