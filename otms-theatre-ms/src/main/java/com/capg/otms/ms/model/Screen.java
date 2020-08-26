package com.capg.otms.ms.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "screen")

public class Screen {

	
		@Id
		private int screenId;
		private String screenName;
		
		@OneToMany
		private List<Show> showList= new ArrayList<>();
		@DateTimeFormat(pattern = "yyyy/MM/dd ")
		private LocalDate movieEndDate;
		@Column(name = "rows_details")
		private int rows;
		@Column(name = "columns_details")
		private int columns;

		public Screen() {
			super();
		}

		public Screen(int screenId, int theatreId, String screenName, List<Show> showList,
				LocalDate movieEndDate, int rows, int columns) {
			super();
			this.screenId = screenId;
			this.screenName = screenName;
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
		 
		public String getScreenName() {
			return screenName;
		}

		public void setScreenName(String screenName) {
			this.screenName = screenName;
		}

		public List<Show> getShowList() {
			return showList;
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
			return "Screen [screenId=" + screenId + ", theatreId=" + ", screenName=" + screenName + ", showList="
					+ ", movieEndDate=" + movieEndDate + ", rows=" + rows + ", columns=" + columns + "]";
		}

}