package com.movies.demo.models;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="movies")
public class Movie {
// with id annotation 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="custom message")
	@Size(min=2,max=8,message="custom !! ")
	private String name;
	
	
	@NotNull(message="custom message")
	@Size(min=2,max=250,message="custom !! ")
	private String description;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
		this.updatedAt=	new Date();	
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt=	new Date();	
	}
	
	//Empty constructor
	public Movie() {}

	public Long getId() {
		return id;
	}

	//construcor with fields 
	public Movie(@NotNull(message = "custom message") @Size(min = 2, max = 8, message = "custom !! ") String name,
			@NotNull(message = "custom message") @Size(min = 2, max = 250, message = "custom !! ") String description) {
		super();
		this.name = name;
		this.description = description;
	}

	// setters and Getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
