package com.login.demo.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class LoginUser {
// attributes 
	@NotEmpty(message="Email is required")
    @Email(message="Please enter a valid email")
	private String email;
	
	// password
	@NotBlank
	@NotNull
	private String password;
	
	//empty constructor 
	public LoginUser() {
	}

	public LoginUser(
			@NotEmpty(message = "Email is required") @Email(message = "Please enter a valid email") String email,
			@NotBlank @NotNull String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	// getters & setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	

}
