package com.movies.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movies.demo.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {
// get all movies 
	List<Movie> findAll();
// get movie by name 
	List<Movie> findByNameContains(String name);
// create 
	//Movie create(Movie movie);
}
