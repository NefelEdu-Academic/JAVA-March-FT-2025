package com.first.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//Create another package : => EXTREMLY important that holds the initial package from where your hello world application already is located
//first rule will be adding the rest controller annotation at the very top of our class
//for us to create a route we need a particular annotation called request mapping this will be similar to what we did in python where we did the app.route
@RestController
// if we want to have a prefix of our url 
//@RequestMapping("/user")
public class MainController {

	
	//request Mapping name of the route 
	// make a method that will handel the request to / 
		@RequestMapping("/home")
		
		//declare a function that return a string
		// extremely important name your methods always different from all the others method that you have called in any of the routes remember at the end they are all integrated to the main application so we cannot have duplicate names (we can do with different params BUT it's not recommanded )
		public String index() {
			return "<h1>Hello from First Spring</h1>";
		}
		//send back some html tags like if i put an h1 here it will actually be rendered as an h1 tag in the browser
		@GetMapping("/profile")
		public String profile() {
			return "<h1>Hello from Profile</h1>";
		}
		
		// let's use the path variables 
		// in pythin /user/int:<id>
		
		@RequestMapping("/user/{firstName}/{lastName}")
		public String getFullName(@PathVariable("firstName") String name,
				@PathVariable("lastName") String lastName ) {
			return "Hello , my name is : " +name + " "+lastName;
		}
		
		// let's see the query params 
		@RequestMapping("/user/{age}")
		public String getInfos(@RequestParam(value="firstName",required=false) String firstName,
				@RequestParam(value="lastName",required=false) String lastName,
				@RequestParam(value="age",required=false) int ageFromParams,
				@PathVariable("age") int age) {
			////http://localhost:8080/user/21?firstName=ali&lastName=essoudani
			return "Hello , my name is : " +firstName + " "+lastName +" my age is : "+age +" "+ ageFromParams; 
		}
		
	
		
		
		
		
}
