package com.login.demo.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
// attributes
	//id
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @NotBlank
	   @Size(min=3, max=30, message="Username must be between 3 and 30 characters")
	private String name;
	
	 @NotEmpty(message="Email is required!")
	 @Email(message="Please enter a valid email!")
	 private String email;
	
	 
	 private int numberOfUpdate=0;
	 
	 @NotEmpty(message="Password is required!")
	    @Size(min=3, max=128, message="Password must be between 8 and 128 characters")
	    private String password;
	
	 
	 @Transient
	 
	    @NotEmpty(message="Confirm Password is required!")
	    @Size(min=3, max=128, message="Confirm Password must be between 8 and 128 characters")
	 private String confirm;
	 
	 @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    
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
	
	
	//empty constructor
	public User() {
		
	}

	public User(Long id,
			@NotBlank(message = "Username is required!") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters") String name,
			@NotEmpty(message = "Email is required!") @Email(message = "Please enter a valid email!") String email,
			int numberOfUpdate,
			@NotEmpty(message = "Password is required!") @Size(min = 3, max = 128, message = "Password must be between 8 and 128 characters") String password,
			@NotEmpty(message = "Confirm Password is required!") @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters") String confirm,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.numberOfUpdate = numberOfUpdate;
		this.password = password;
		this.confirm = confirm;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	
	// setters and getters 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumberOfUpdate() {
		return numberOfUpdate;
	}

	public void setNumberOfUpdate(int numberOfUpdate) {
		this.numberOfUpdate = numberOfUpdate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
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
