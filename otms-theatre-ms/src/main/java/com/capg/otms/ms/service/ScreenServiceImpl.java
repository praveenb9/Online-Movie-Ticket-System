package com.capg.otms.ms.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.otms.ms.exception.InvalidInputException;
import com.capg.otms.ms.exception.TheatreAlreadyExistsException;
import com.capg.otms.ms.exception.TheatreException;
import com.capg.otms.ms.model.Screen;
import com.capg.otms.ms.model.Show;
import com.capg.otms.ms.model.Theatre;
import com.capg.otms.ms.reprository.ITheatreRepo;
import com.capg.otms.ms.reprository.ScreenRepo;
import com.capg.otms.ms.reprository.ShowRepo;

@Service
public class ScreenServiceImpl implements IScreenService {
    
	@Autowired
	
	ScreenRepo screenRepo;
	@Autowired
	ITheatreRepo theatrerepo;
	@Autowired
	ShowRepo showrepo;
	@PostConstruct
	 void init () {
		
		 Show show=new  Show();
		 show.setMovieId(1234);
		 show.setShowEndTime(LocalDateTime.of(2020, 9, 30, 5, 45));
		 show.setShowStartTime(LocalDateTime.of(2020,9,30,2, 30));
		 show.setSeats(Arrays.asList(1234567));
		 show.setShowId(1234);
		 show.setShowName("xyx");

		 Screen screen= new Screen();
		 screen.setScreenId(1);
		 screen.setScreenName("box");
		 screen.setRows(3);
		 screen.setColumns(4);
		 screen.getShowList().add(show);
		 
		 Theatre theatre= new Theatre ();
		 theatre.setTheatreId(123) ;
		 theatre.setTheatreCity("hyd");
		 theatre.setTheatreName("gsm");
		 theatre.setMovies(Arrays.asList(1234));
		 theatre.setManagerName("ashok");
		 theatre.setManagerContact("1234");
		 theatre.getListOfScreens().add(screen);
	
	
		 showrepo.save(show);
		 screenRepo.save(screen);
		 theatrerepo.save(theatre);
	 }
	

	
	public Screen addScreen(Screen screen) {
		int screenId = screen.getScreenId();
		if (screenId == 0) {
			throw new InvalidInputException("screen id must be minimum of four characters");
		} else if (screenRepo.existsById(screenId)) {
			throw new TheatreAlreadyExistsException("user already exists with this id :" + screenId);
			
		}

		return screenRepo.saveAndFlush(screen);
	}

	
	public Screen updateScreenById(Screen screen) {
		Integer screenId = screen.getScreenId();
		if (screenId == 0) {
			throw new InvalidInputException("screen id must be minimum of four characters ");
		} else if (screenRepo.existsById(screenId)) {
			Screen updateScreen = screenRepo.getOne(screenId);

			updateScreen.setScreenName(screen.getScreenName());
			updateScreen.setColumns(screen.getColumns());
			updateScreen.setRows(screen.getRows());
			updateScreen.setMovieEndDate(screen.getMovieEndDate());
			screenRepo.saveAndFlush(updateScreen);
		}
		return screen;
	}

	
	public boolean deleteScreenById(int screenId) {

		if (screenRepo.existsById(screenId)) {
			screenRepo.deleteById(screenId);
		} else {
			throw new TheatreException("Id not found");
		}
		return true;
	}

	
	public List<Screen> findAllScreens(){

		return screenRepo.findAll();
	}

	
	public Screen getScreenById(int screenId) {
		return screenRepo.getOne(screenId);
	}


	public boolean validateScreenId(int screenId) {
		String screen = Integer.toString(screenId);
		if (!(screen.length()>= 4))
			throw new TheatreException("ScreenId must be minimum of 4 characters");
		return true;
	}
}