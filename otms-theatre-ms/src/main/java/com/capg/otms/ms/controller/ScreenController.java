package com.capg.otms.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.otms.ms.model.Screen;
import com.capg.otms.ms.service.ScreenServiceImpl;


@RestController
@RequestMapping("/screen")

public class ScreenController {

	@Autowired
	ScreenServiceImpl screenService;

	public void addDummyScreens() {

	}
	@GetMapping("/all")
	public List<Screen> findAllScreens() {

		return screenService.findAllScreens();

	}

	@PostMapping("/add")
	public Screen addScreen(@RequestBody Screen screen) {
		if (screenService.validateScreenId(screen.getScreenId())) {
			Screen screen1 = screenService.addScreen(screen);
			screen = screen1;
		}
		return screen;

	}

	@PutMapping("/update")
	public Screen updateTheScreenById(@RequestBody Screen screen) {

		return screenService.updateScreenById(screen);

	}

	@DeleteMapping("/delete/id/{id}")
	public void deleteScreenById(@PathVariable("id") int screenId) {

		screenService.deleteScreenById(screenId);

	}
}