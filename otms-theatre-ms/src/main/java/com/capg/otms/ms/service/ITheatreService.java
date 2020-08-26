package com.capg.otms.ms.service;

import java.util.List;

import com.capg.otms.ms.model.Theatre;
;

public interface ITheatreService {
	Theatre addTheatre (Theatre theatre);
	Theatre updateTheatre(Theatre theatre); 
	boolean deleteTheatreById(Integer theatreId); 
	List<Theatre> findAllTheatres(); 
	Theatre getTheatreById(Integer theatreId);
	Theatre getTheatreByName(String theatreName);
	boolean validateTheatreId(Integer theatreId) ;
}