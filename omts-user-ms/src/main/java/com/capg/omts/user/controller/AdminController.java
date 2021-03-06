package com.capg.omts.user.controller;

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

import com.capg.omts.user.model.Movie;
import com.capg.omts.user.model.Screen;
import com.capg.omts.user.model.Show;
import com.capg.omts.user.model.Theater;
import com.capg.omts.user.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	IAdminService adminService;
	
	@PostMapping("/addTheater")
	public Theater addTheater(@RequestBody Theater theater)
	{
		
		return adminService.addTheater(theater);
	}
	
	@DeleteMapping("/theater/theaterId/{theaterId}")
	public boolean deleteTheater(@PathVariable int theaterId)
	{
		
		return adminService.deleteTheater(theaterId);
	}
	
	@PutMapping("/updateTheatre")
	public Theater updateTheatre(@RequestBody Theater theater)
	{
		return adminService.updateTheatre(theater);
	}
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie)
	{
		return adminService.addMovie(movie);
	}
	
	@DeleteMapping("/movie/movieId/{movieId}")
	public boolean deleteMovie(@PathVariable int movieId)
	{
		return adminService.deleteMovie(movieId);
	}
	
	@PutMapping("/updateMovie")
	public Movie updateMovie(@RequestBody Movie movie)
	{
		return adminService.updateMovie(movie);
	}
	
	@PostMapping("/addShow")
	public Show addShow(@RequestBody Show show)
	{
		return adminService.addShow(show);
	}
	
	@DeleteMapping("/show/showId/{showId}")
	public boolean deleteShow(@PathVariable int showId)
	{
		return adminService.deleteShow(showId);
	}
	
	@PutMapping("/updateShow")
	public Show updateShow(@RequestBody Show show)
	{
		return adminService.updateShow(show);
	}
	
	@PostMapping("/addScreen")
	public Screen addScreen(@RequestBody Screen screen)
	{
		return adminService.addScreen(screen);
	}
	
	@DeleteMapping("/screen/screenId/{screenId}")
	public boolean deleteScreen(@PathVariable int screenId)
	{
		return adminService.deleteScreen(screenId);
	}
	
	@PutMapping("/updateScreen")
	public Screen updateScreen(@RequestBody Screen screen)
	{
		return adminService.updateScreen(screen);
	}
	
	@GetMapping("/getAllMovies")
	public List<Movie> getallMovies(){
		return adminService.getAllMovies();
	}	
	
	@GetMapping("/viewTheaters")
	public List<Theater> getAllTheaters()
	{
		return adminService.getAllTheaters();
	}
	
	@GetMapping("getAllShows")
	public List<Show> getAllShows()
	{
		return adminService.getAllShows();
	}
	
	@GetMapping("getAllScreens")
	public List<Screen> getAllScreens()
	{
		return adminService.getAllScreens();
	}
	
}
