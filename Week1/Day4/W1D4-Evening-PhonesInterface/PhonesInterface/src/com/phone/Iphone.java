package com.phone;

public class Iphone extends Phone implements InterfaceTest ,Inter2{

	private String os;
	
	//constructor
	public Iphone(int batteryLife, Long imei) {
		super(batteryLife,imei);
		this.os="IOS";
	}

	// implement the abstract method from the father class 
	public void displayInfo() {
		System.out.println("Iphone OS is "+this.os);
	}
	
	public void ring() {
		
	};
public void unlock() {
		
	};
	public void ring2() {
		
	};
public void unlock2() {
		
	};
}
