package com.login.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.demo.models.LoginUser;
import com.login.demo.models.Story;
import com.login.demo.models.User;
import com.login.demo.services.StoryService;
import com.login.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
// 
	@Autowired
	UserService userServ;
	
	@Autowired
	StoryService storyService;
	
	
	// if we want to 
	// render the index page 
	@GetMapping("/")
	public String index(@ModelAttribute("newUser") User user,@ModelAttribute("newLogin") LoginUser loginUser,HttpSession session) {
		// if we want to forbid the redirect to index if loggedin
		Long sessionId= (Long) session.getAttribute("userId");
		//route garding => i will access the home page only if am connected 
		if(sessionId!=null) {
			return "redirect:/home";
		}
		
		
		return "index";
	}
	
	//  register process 
@PostMapping("/register")
public String register(@Valid @ModelAttribute("newUser") User newUser,
		
		               BindingResult result,
		               HttpSession session,
		               Model model) {
	          
	
	//Register method from my service 
	User userInDb=userServ.register(newUser, result);
	
	//test the result has errors =>return the view index.jsp
	if(result.hasErrors()) {
		model.addAttribute("newLogin",new LoginUser());
		return "index";
	}
	
	
	session.setAttribute("userId", userInDb.getId());
	return "redirect:/home";
	
}

// get the home Page
@GetMapping("/home")
public String home(Model model,HttpSession session) {
	
	
	//type casting 
	Long sessionId= (Long) session.getAttribute("userId");
	//route garding => i will access the home page only if am connected 
	if(sessionId==null) {
		return "redirect:/";
	}
	
	System.out.print("testtttttttttttttttttt");
	// get the user connected 
	User connectedUser=userServ.findById(sessionId);
	// set connected user to the model =>pass it to the view
	
	model.addAttribute("connectedUser",connectedUser);
	// get all stories and set it to the model 
	model.addAttribute("allStories",storyService.getAllStories() );
	
	return "home";
}

//logout process
@GetMapping("/logout")
public String logout(HttpSession session) {
	// clear the session
	session.invalidate();
	// redirect the index 
	return "redirect:/";
}

//login process
@PostMapping("/login")
public String login(@Valid @ModelAttribute("newLogin")LoginUser loginUser,
		             BindingResult result,
		             HttpSession session,
		             Model model) {
	// we will use the login method of the service 
	User user =userServ.login(loginUser, result);
	
	// check the binding result 
	if(result.hasErrors()) {
		
		model.addAttribute("newUser",new User());
		//return the index page 
		return "index";
	}
	//save the userID in the session 
	session.setAttribute("userId", user.getId());
	
	return "redirect:/home";
	
}

// get the create view 
@GetMapping("/stories/new")
public String createStory(@ModelAttribute("story") Story story,HttpSession session) {
	Long sessionId= (Long) session.getAttribute("userId");
	//route garding => i will access the home page only if am connected 
	if(sessionId==null) {
		return "redirect:/";
	}
	
	return "create";
}

// post route for the story creation 
@PostMapping("/story/new")
public String create(@Valid @ModelAttribute("story") Story story,
		BindingResult result,
		HttpSession session) {
	
	// if we have validation errors 
	if(result.hasErrors()) {
		return "create";
	}
	// get the connected user 
	Long sessionId= (Long) session.getAttribute("userId");
	
	// get the user connected 
	User connectedUser=userServ.findById(sessionId);
	// set creator to the connected user 
	story.setCreator(connectedUser);
	storyService.create(story);
	return "redirect:/home";
}

// like route 
@GetMapping("/like/{storyId}")
public String like(@PathVariable("storyId") Long storyId,
		HttpSession session) {
	storyService.likeStory(storyId, (Long) session.getAttribute("userId"));
	return "redirect:/home";
}



//dislike route 
@GetMapping("/dislike/{storyId}")
public String dislike(@PathVariable("storyId") Long storyId,
		HttpSession session) {
	storyService.dislikeStory(storyId, (Long) session.getAttribute("userId"));
	return "redirect:/home";
}


}
