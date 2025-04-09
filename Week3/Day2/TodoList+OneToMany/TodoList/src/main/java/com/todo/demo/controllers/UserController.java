package com.todo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.todo.demo.models.User;
import com.todo.demo.services.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
@Autowired 
UserService userService;
	//get the new user view 
	@GetMapping("/user/new")
	public String create(@ModelAttribute("user") User user) {
		return "createUser";
	}
	
// collect the user dqtq qnd creqte user 
	@PostMapping("/user/new")
	public String create(@Valid @ModelAttribute("user") User user,
			BindingResult result
			) {
		// if we have validation errors 
		if(result.hasErrors()) {
			return "createUser";
		}
		// create user 
		userService.createUser(user);
		// redirect to index / 
		return "redirect:/";
	}
	
	
	//delete user with just a get method \\ in jsp => href
	//@GetMapping("/user/delete/{userId}")
	//public String deleteUser(@PathVariable Long userId) {
		
		//userService.deleteUser(userId);
		//return "redirect:/";
	//}
	
	//delete user with hidden input with form in jsp 
	@DeleteMapping("/user/delete/{userId}")
	public String deleteUser(@PathVariable Long userId) {
		
		userService.deleteUser(userId);
		return "redirect:/";
	}
	
	
	

}
