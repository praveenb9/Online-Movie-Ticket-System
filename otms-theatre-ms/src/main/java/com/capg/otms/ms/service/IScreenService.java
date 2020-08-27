package com.capg.otms.ms.service;

import java.util.List;

import com.capg.otms.ms.model.Screen;



public interface IScreenService {
	Screen addScreen (Screen screen);
	Screen updateScreenById(Screen screen);
	boolean deleteScreenById(int screenId);
	List<Screen> findAllScreens();
	Screen getScreenById(int screenId);
	
	boolean validateScreenId(int screenId);

}