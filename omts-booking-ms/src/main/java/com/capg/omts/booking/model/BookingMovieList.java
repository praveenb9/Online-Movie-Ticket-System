package com.capg.omts.booking.model;

import java.util.List;

public class BookingMovieList {

	private List bookMovieBean;
	
	public BookingMovieList() {
		
	}
	public BookingMovieList(List bookingMovieBean) {
		super();
		bookMovieBean = bookingMovieBean;
	}
	public List getBookingMovieBean() {
		return bookMovieBean;
	}
	public void setBookingMovieBean(List bookingMovieBean) {
		bookMovieBean = bookingMovieBean;
	}
	
}