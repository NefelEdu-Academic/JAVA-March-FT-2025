package com.login.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.login.demo.models.Story;

@Repository
public interface StoryInterface extends CrudRepository<Story,Long> {
 // find all 
	List<Story> findAll();
}
