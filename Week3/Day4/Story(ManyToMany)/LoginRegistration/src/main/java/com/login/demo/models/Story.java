package com.login.demo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="stories")
public class Story {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	 @NotBlank
	   @Size(min=3, max=30, message="Title must be between 3 and 30 characters")
	private String title;
	
	 @NotBlank
	   @Size(min=3, max=500, message="Content must be between 3 and 30 characters")
	private String content;
	 
	 
	 @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    private int numberOfUpdate=0;   

	    @ManyToOne
	    @JoinColumn(name="user_id")
	    private User creator;
	    
	  // many to many 
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(name="users_stories",
	    		joinColumns=@JoinColumn(name="Story_id"),
	              inverseJoinColumns = @JoinColumn(name = "user_id"))
	   private  List<User> likers;
	    
	    
	    
	    
	    // methods for pre-persist and pre-update
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	        this.updatedAt = new Date();
	        // send email to the user email
	    }
	    
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	        this.numberOfUpdate++;
	    }
	 
	// empty constructor
	public Story() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getNumberOfUpdate() {
		return numberOfUpdate;
	}

	public void setNumberOfUpdate(int numberOfUpdate) {
		this.numberOfUpdate = numberOfUpdate;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<User> getLikers() {
		return likers;
	}

	public void setLikers(List<User> likers) {
		this.likers = likers;
	}

	public Story(Long id,
			@NotBlank @Size(min = 3, max = 30, message = "Title must be between 3 and 30 characters") String title,
			@NotBlank @Size(min = 3, max = 500, message = "Content must be between 3 and 30 characters") String content,
			Date createdAt, Date updatedAt, int numberOfUpdate, User creator, List<User> likers) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.numberOfUpdate = numberOfUpdate;
		this.creator = creator;
		this.likers = likers;
	}

	
}
