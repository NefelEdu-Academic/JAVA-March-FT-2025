package com.demo.jsp.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		String name = "Idriss";
		model.addAttribute("name",name);
		ArrayList<String> ourList=new ArrayList<>();
		ourList.add("Ali");
		ourList.add("Yaya");
		ourList.add("Ghada");
		ourList.add("Ahmed");
		model.addAttribute("ourList",ourList);
		int age= 19;
		model.addAttribute("age",age);
		return "home.jsp";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		// we can call a service to get the user from db 
		//User connectedUser= we can call a service to get the user from db
		//model.addAttribute("user",connectedUser);
		String name = "Amine";
		model.addAttribute("name",name);
		ArrayList<String> ourList=new ArrayList<>();
		ourList.add("Ali");
		ourList.add("Yaya");
		ourList.add("Ghada");
		ourList.add("Ahmed");
		model.addAttribute("ourList",ourList);
		return "profile.jsp";
	}
}
