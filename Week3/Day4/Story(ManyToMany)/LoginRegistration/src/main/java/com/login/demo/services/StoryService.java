package com.login.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.demo.models.Story;
import com.login.demo.models.User;
import com.login.demo.repositories.StoryInterface;
import com.login.demo.repositories.UserRepository;

@Service
public class StoryService {

	@Autowired
	StoryInterface storyRepo;
	
	@Autowired
	UserService userService;
	
	// get all stories 
	public List<Story> getAllStories(){
		return storyRepo.findAll()
;	}
	
	// create story 
	public Story create(Story story) {
		return storyRepo.save(story);
	}
	
	//find by id 
	public Story getById(Long id) {
		// equi: storyRepo.findById(id).ElseOr(null)  (see the doc )
		Optional<Story> story=storyRepo.findById(id);
		if(story.isEmpty()) {
			return null;
		}
		return story.get();
	}
	
	// update
	public Story update(Story story) {
		System.out.print("Like");
		return storyRepo.save(story);
	}
	
	// delete story
	public void delete(Long id) {
	/* get the story by id 
	 * i wil lset the creator to null 
	 * i will set the liker (List of User) to null
	 * */
		Story story = getById(id);
		story.setCreator(null);
		story.setLikers(null);

		storyRepo.deleteById(id);
	}
	
	// like process logic 
	public void likeStory (Long storyId,Long userId ) {
		// find the story & the user 
		Story story =getById(storyId);
		User user=userService.findById(userId);
		
		story.getLikers().add(user);
		update(story);
		
	}
	
	// dislike process logic 
		public void dislikeStory (Long storyId,Long userId ) {
			// find the story & the user 
			Story story =getById(storyId);
			User user=userService.findById(userId);
			story.getLikers().remove(user);
			update(story);
			
		}
	
	
	
}
