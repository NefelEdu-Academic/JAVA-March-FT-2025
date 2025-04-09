package com.todo.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.demo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

	// find all users 
	List<User>  findAll();
	
}
