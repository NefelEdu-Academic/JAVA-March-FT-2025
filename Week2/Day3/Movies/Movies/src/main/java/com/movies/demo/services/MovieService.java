package com.movies.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.demo.models.Movie;
import com.movies.demo.repositories.MovieRepository;

@Service
public class MovieService {
	
	/* first way to inject Repository :  private final MovieRepository movieRepo
	 * public MovieService(MovieRepository movieRepo){
	 * this.movieRepo = movieRepo;
	 * }
	 * */
// we will link the repo to the service ; to access to the methods(Dependency injection) 
	@Autowired
	MovieRepository movieRepo;

	// find all movies 
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	// create movie 
	public Movie createMovie(Movie movie) {
		
		return movieRepo.save(movie);
	}
	
	
	

}
