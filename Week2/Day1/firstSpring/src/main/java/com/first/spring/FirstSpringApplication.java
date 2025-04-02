package com.first.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The rest Controller  

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
	}
	
	// make a method that will handel the request to / 
	//@RequestMapping("/")
	//public String index() {
		//return "<h1>Hello from First Spring</h1>";
	//}
	
	
	//send back some html tags like if i put an h1 here it will actually be rendered as an h1 tag in the browser
	//@RequestMapping("/profile")
	//public String profile() {
		//return "<h1>Hello from Profile</h1>";
	//}

}
