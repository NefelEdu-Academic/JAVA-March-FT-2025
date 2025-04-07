package com.todo.demo.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="todos")
public class Todo {
// id 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Size(min=2,max=500,message="The title must be at least 2 characters")
	@NotBlank
	private String title;
	
	@Size(min=5,message="Description must be at least 5 characters")
	@NotBlank
	private String description;
	
	private boolean completed =false;
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	
	// methods
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
		this.updatedAt=new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt=new Date();
	}
	
	
	
	
	
	
	// empty constructor
	public Todo() {}

	
	// constructor with fields 
	public Todo(
			@Size(min = 2, max = 500, message = "The title must be at least 2 characters") @NotBlank String title,
			@Size(min = 5, message = "Description must be at least 5 characters") @NotBlank String description,
			boolean completed, Date createdAt, Date updatedAt) {
		
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	//setters & getters 
	
	public Long getId() {
		return id;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
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
	
	
	
	

}
