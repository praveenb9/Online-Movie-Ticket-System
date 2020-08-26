package com.capg.otms.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.ms.exception.InvalidInputException;
import com.capg.otms.ms.exception.TheatreAlreadyExistsException;
import com.capg.otms.ms.exception.TheatreException;
import com.capg.otms.ms.model.Show;
import com.capg.otms.ms.reprository.ShowRepo;

@Service
public class ShowServiceImpl implements IShowService {

	@Autowired
	ShowRepo showRepo;

	 
	public Show addShow(Show show) {
		Integer showId = show.getShowId();
		if (showId == 0) {
			throw new InvalidInputException("show id must be minimum of four characters");
		} else if (showRepo.existsById(showId)) {
			throw new TheatreAlreadyExistsException("user already exists with this id :" + showId);
		}
		return showRepo.saveAndFlush(show);

	}
	
	public Show updateShowById(Show show) {

		int showId = show.getShowId();
		if (showId == 0) {
			throw new InvalidInputException("show id must be minimum of four characters");
		} else if (showRepo.existsById(showId)) {
			Show updateShow = showRepo.getOne(showId);
			updateShow.setShowName(show.getShowName());
			updateShow.setShowStartTime(show.getShowStartTime());
			updateShow.setShowEndTime(show.getShowEndTime());
			showRepo.saveAndFlush(updateShow);
		}
		return show;

	}

	public boolean deleteShowById(Integer showId) {

		if (showRepo.existsById(showId)) {

			showRepo.deleteById(showId);
		} else {
			throw new TheatreException("Id not found");
		}
		return true;

	}

	public List<Show> findAllShows() {
		return showRepo.findAll();

	}

	public Show getShowById(Integer showId) {

		return showRepo.getOne(showId);
	}

	public boolean validateShowId(int showId) {
		String show = Integer.toString(showId);
		if (!(show.length()>=8))
			throw new TheatreException("ShowId must be minimum of 8 characters");

		return true;
	}


}