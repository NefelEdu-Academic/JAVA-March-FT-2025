package com.todo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.demo.models.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {

	
	//find all 
	List<Todo> findAll();
	//get todo by title contains
	List<Todo> findByTitleContains(String title);
	
}
