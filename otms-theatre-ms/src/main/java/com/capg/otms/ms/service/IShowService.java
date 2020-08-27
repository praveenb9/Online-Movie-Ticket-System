package com.capg.otms.ms.service;

import java.util.List;

import com.capg.otms.ms.model.Show;


public interface IShowService {
	Show addShow (Show show);
	Show updateShowById(Show show);
	boolean deleteShowById(Integer showId);
	List<Show> findAllShows();
	Show getShowById(Integer showId);
	boolean validateShowId(int showId);
}