package com.todo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.demo.models.User;
import com.todo.demo.repositories.UserRepository;

@Service
public class UserService {

	// link the repository
	@Autowired
	UserRepository useRepo;

	
	// get all users method 
	public List<User> getAllUsers(){
		return useRepo.findAll();
	}
	
	
	// create user 
	public User createUser(User user) {
		return useRepo.save(user);
	}
	
	//get user by id 
	public User getUserById(Long id) {
		Optional<User> u = useRepo.findById(id);
		//
		if(u.isPresent()) {
			return u.get();
		}
		return null;
	}
	
	// delete user 
	public void deleteUser(Long id ) {
		useRepo.deleteById(id);
	}
	
	//update user
	public User updateUser(User user) {
		return useRepo.save(user);
	}
	
}
