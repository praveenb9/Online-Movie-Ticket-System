package com.capg.omts.login.model;

import java.time.LocalDate;
import java.util.List;


import org.springframework.format.annotation.DateTimeFormat;

public class Screen {

	private int screenId;
	private int theaterId;
	private String screenName;
	private List<Show> showList;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate movieEndDate;
	private int rows;
	private int columns;
	
	public Screen() {
		
	}

	
	public Screen(int screenId, int theaterId, String screenName, List<Show> showList, LocalDate movieEndDate, int rows,
			int columns) {
		super();
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.screenName = screenName;
		this.showList = showList;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
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


	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theaterId=" + theaterId + ", screenName=" + screenName
				+ ", showList=" + showList + ", movieEndDate=" + movieEndDate + ", rows=" + rows + ", columns="
				+ columns + "]";
	}
	
	
}
