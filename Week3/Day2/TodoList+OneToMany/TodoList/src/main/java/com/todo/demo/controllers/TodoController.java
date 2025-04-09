package com.todo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.demo.models.Todo;
import com.todo.demo.models.User;
import com.todo.demo.services.TodoService;
import com.todo.demo.services.UserService;

import jakarta.validation.Valid;

@Controller
public class TodoController {
// auto wire the service 
	@Autowired
	TodoService todoServ;
	
	// link the service of the user 
	@Autowired
	UserService userService;
	// index page 
	@GetMapping("/")
	public String index(Model model) {
		// get all the todos
		List<Todo> todos=todoServ.getAllTodos();
		// get al lsuers
		List<User> users = userService.getAllUsers();
				System.out.println(users.size());
;		System.out.println("**************");
		System.out.println(todos);
		// we will put all todos in the mode (pass) to show them in the view (jsp)
		model.addAttribute("todos",todos);
		model.addAttribute("users", users);
		return "index";
	}
	
	// get the create view 
	@GetMapping("/todo/new")
	public String createPage(@ModelAttribute("todo")Todo todo,Model model) {
		//get all users 
		List<User> users =userService.getAllUsers();
		model.addAttribute("users",users);
		return "create";
	}
	
	// Post to create todo
	@PostMapping("/todo/new")
	public String createTodo(@Valid @ModelAttribute("todo")Todo todo,
			BindingResult result) {
		// we will test if there is a validation errors 
		if(result.hasErrors()) {
			// we will return the create view jsp 
			return "create";
		}
		// we will save the data if there is no error 
		todoServ.createTodo(todo);
		System.out.println("this is the model attribute "+todo.getTitle());
		// we will redirect  the the index
		return "redirect:/";
	}
	
	//get edit page 
	@GetMapping("/todo/edit/{id}/{title}")
	public String renderEditPage(@ModelAttribute("todo")Todo todo,Model model,@PathVariable("id")Long id
			,@PathVariable("title")String title) {
		//1-get our todo using the id 
		Todo todoToEdit=todoServ.getTodoById(id);
		// gt all the users 
		List<User> users=userService.getAllUsers();
		model.addAttribute("users",users);
		model.addAttribute("todo",todoToEdit);
		
		return "editTodo";
	}

	// perform edit
	@PutMapping("/edit/todo/{id}") 
	public String updateTodo(@PathVariable Long id, @Valid @ModelAttribute("todo") Todo todo, BindingResult result)
	{ if (result.hasErrors()) { return "editTodo"; 

	 } 
	todoServ.updateTodo(todo); 

	return "redirect:/"; }


	
	// the search method 
	@GetMapping("/todos/search")
	public String handleSearch(@RequestParam("query") String query,Model model) {
		//use the todo service to get todos by title 
		List<Todo> searchedTodos=todoServ.search(query);
		model.addAttribute("todos",searchedTodos);
		
		
		return "index";
	}
	

}
