package com.capg.otms.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.ms.exception.InvalidInputException;
import com.capg.otms.ms.exception.TheatreAlreadyExistsException;
import com.capg.otms.ms.exception.TheatreException;
import com.capg.otms.ms.model.Theatre;
import com.capg.otms.ms.reprository.ITheatreRepo;

@Service
public class TheatreServiceImpl implements ITheatreService {
	
	
	@Autowired
	ITheatreRepo theatreRepo;

	
	public Theatre addTheatre(Theatre theatre) {
		Integer theatreId = theatre.getTheatreId();
		if (theatreId == 0) {
			throw new InvalidInputException("theatre id must be minimum of four characters starting with 2");
		} else if (theatreRepo.existsById(theatreId)) {
			throw new TheatreAlreadyExistsException("user already exists with this id :" + theatreId);
		}

		return theatreRepo.saveAndFlush(theatre);
	}

	
	public Theatre updateTheatre(Theatre theatre) {
		Integer theatreId = theatre.getTheatreId();
		if (theatreId == 0) {
			throw new InvalidInputException("theatre id must be minimum of four characters starting with 2");
		} else if (theatreRepo.existsById(theatreId)) {
			Theatre updateTheatre = theatreRepo.getOne(theatreId);
			updateTheatre.setTheatreName(theatre.getTheatreName());
			updateTheatre.setTheatreCity(theatre.getTheatreCity());
			updateTheatre.setMovies(theatre.getMovies());
			updateTheatre.setManagerName(theatre.getManagerName());
			updateTheatre.setManagerContact(theatre.getManagerContact());
			theatreRepo.saveAndFlush(updateTheatre);
		}

		else {
			throw new TheatreException("Id not found");
		}
		return theatre;
	}

	public boolean deleteTheatreById(Integer theatreId) {

		if (theatreRepo.existsById(theatreId)) {

			theatreRepo.deleteById(theatreId);
		} else {
			throw new TheatreException("Id not found");
		}
		return true;

	}

	
	public List<Theatre> findAllTheatres() {

		return theatreRepo.findAll();
	}

	
	public Theatre getTheatreByName(String theatreName) {

		return theatreRepo.getByTheatreName(theatreName);
	}

	
	@Override
	public boolean validateTheatreId(Integer theatreId) {
		String theatre = Integer.toString(theatreId);
		if (!(theatre.length() >= 4 && theatre.charAt(0) == '2')) {
			throw new TheatreException("TheatreId must be minimum of 4 characters, starting with 2..");
		}
		return true;
	}

	
	@Override
	public Theatre getTheatreById(Integer theatreId) {
		return theatreRepo.getByTheatreId(theatreId);
	}
}