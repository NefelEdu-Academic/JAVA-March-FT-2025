package com.todo.demo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	// id 
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@Size(min=2,max=500,message="The name must be at least 2 characters")
		@NotBlank
		private String name;
	
		
		@Column(updatable=false)
		private Date createdAt;
		
		private Date updatedAt;
	
		@OneToMany(cascade=CascadeType.ALL,mappedBy="user")
		List<Todo> myTodos;
		
		
		
		
		
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
	public User() {
		
	}

	
	public User(Long id,
			@Size(min = 2, max = 500, message = "The name must be at least 2 characters") @NotBlank String name,
			Date createdAt, Date updatedAt, List<Todo> myTodos) {
		super();
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.myTodos = myTodos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Todo> getMyTodos() {
		return myTodos;
	}

	public void setMyTodos(List<Todo> myTodos) {
		this.myTodos = myTodos;
	}
	

}
