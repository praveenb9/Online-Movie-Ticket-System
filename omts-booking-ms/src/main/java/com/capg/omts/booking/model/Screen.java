package com.capg.omts.booking.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Screen {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int screenId;
	private int theaterId;
	private String screenName;
	private List<Show> showList;
	private LocalDate movieEndDate;
	private int rows;
	private int columns;
	
	public Screen() {
		// TODO Auto-generated constructor stub
	}

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public List<Show> getShowList() {
		return showList;
	}

	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}

	public LocalDate getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(LocalDate movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
}