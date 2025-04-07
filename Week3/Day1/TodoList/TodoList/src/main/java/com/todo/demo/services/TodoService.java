package com.todo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.demo.models.Todo;
import com.todo.demo.repositories.TodoRepository;

@Service
public class TodoService {

	// autowire the repo 
	@Autowired
	TodoRepository todoRepo;
	
	//Create todo
	public Todo createTodo(Todo todo) {
		return todoRepo.save(todo);
	}
	
	// get all todos
	public List<Todo> getAllTodos(){
		return todoRepo.findAll();
	}
	
	// get todo by id
	public Todo   getTodoById(Long id) {
		Optional<Todo> todo=todoRepo.findById(id);
		if(todo.isEmpty()) {
			return null;
		}
		// we will use  the .get to get the Todo object 
		return todo.get();
		
	}
	
	//delete todo
	public void deleteToDo(Long id) {
		todoRepo.deleteById(id);
	}
	
	// edit todo 
	public Todo updateTodo(Todo todo) {
		return todoRepo.save(todo);
	}

}
