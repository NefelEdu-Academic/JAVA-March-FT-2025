package com.movies.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.movies.demo.models.Movie;
import com.movies.demo.services.MovieService;

@Controller
public class MovieController {
	@Autowired
	MovieService movieService;

	
	// get create page 
	@GetMapping("/create")
	public String create( Model model) {
		List<Movie> myMovies=movieService.getAllMovies();
		model.addAttribute("movies",myMovies);
		System.out.println(myMovies);
		return "createMovie.jsp";
	}
	
	
	// post method to create movie

}
