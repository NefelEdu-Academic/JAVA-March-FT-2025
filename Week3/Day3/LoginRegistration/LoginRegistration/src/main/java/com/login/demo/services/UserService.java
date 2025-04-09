package com.login.demo.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.login.demo.models.LoginUser;
import com.login.demo.models.User;
import com.login.demo.repositories.UserRepository;

@Service
public class UserService {
@Autowired 
UserRepository userRepo;

// find by email 
public User findByEmail(String email) {
	Optional<User> u=userRepo.findByEmail(email);
	if(u.isEmpty()) {
		return null;
	}
	return u.get();
}

// registration   "/" index  execution (service methods) return page jsp 
public User register(User newUser,
		BindingResult result ) {
	// check the unique email 
	 if( findByEmail(newUser.getEmail())!=null){
		 //i will add an error to the binding result
		 result.rejectValue("email","uniqueness","Email already exists");
	 }
	 //check password and confirm 
	 if(!newUser.getPassword().equals(newUser.getConfirm())) {
		 result.rejectValue("confirm","match","password and confirm does not match ");
	 }
	 
	 // check validation from model 
	 if(result.hasErrors()) {
		 return null;
	 }
	 
	 // bycrypt the passowrd
	 String hashed=BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
	 
	// set the hashed password to the field or attribute of the newUser
	 newUser.setPassword(hashed);
	 
	 // persisit the data at DB 
	 userRepo.save(newUser);
	 
	 //
	 return newUser;
}

// find by id 
public User findById(Long id) {
	Optional<User> u=userRepo.findById(id);
	if(u.isPresent()) {
		return u.get();
	}
	return null;
}


// login logic in service 
public User login(LoginUser newLogin,
		           BindingResult result) {
	
	// we will check the email existence
	if( findByEmail(newLogin.getEmail())==null){
		 //i will add an error to the binding result
		 result.rejectValue("email","does not exists","Email does not exists");
	 }
	// check the password 
	User user= findByEmail(newLogin.getEmail());
	
	
	
	// check the model (newLogin ) validation 
	if(result.hasErrors()) {
		return null;
	}
	
	// compare using BCrypt 
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password","wrong","wrong Credentials !!!");
		}
	return user;
	
}
 

}
