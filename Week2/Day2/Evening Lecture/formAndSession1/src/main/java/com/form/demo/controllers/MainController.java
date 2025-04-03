package com.form.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	//first method & route : to get the form view 
	@GetMapping("/create")
	public String index(Model model,HttpSession session) {
		model.addAttribute("test","testValue");
		// clear session 
		//session.invalidate();
		return "create.jsp";
		
	}
	
	// now we want to collect the data from the form 
	@PostMapping("/create")
	//@RequestParam(value="firstName")
	public String create(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,Model model,HttpSession session,
			RedirectAttributes redirectAttributes
			) {
		
		String message =firstName + " "+lastName;
		//to see the data travelling from JSP to controller
		// we will test if the firstName is empty
		if(firstName.isBlank()) {
			redirectAttributes.addFlashAttribute("message", "Please enter the first name !");
			return "redirect:/create";
		}
		
		
		model.addAttribute("lastName",lastName);
		session.setAttribute("firstName",firstName);
		
		// we will use redirect to prevent re-submit of the form 
		return "redirect:/profile";
	}
	
	// get profile page 
	@GetMapping("/profile")
	public String viewProfile(HttpSession session) {
		String test=(String) session.getAttribute("firstName");
	if(test ==null) {
		return "redirect:/create";
	};
		return "profile.jsp";
	}
}
