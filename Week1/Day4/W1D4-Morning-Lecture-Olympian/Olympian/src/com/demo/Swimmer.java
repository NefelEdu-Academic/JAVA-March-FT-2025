package com.demo;

public class Swimmer extends Olympian {
// help me to link the father class with the child class=>how to inherit all the  the code of the father class  
	// add the member variables specific to the child
	double swimSpeed;
	
	// constructor
	public Swimmer(String name,int age,double swimSpeed) {
	//use the super keyword to affect the common memeber variables
		super(name,age);
		this.swimSpeed=swimSpeed;
		this.setEnergyLevel(200.0);
		//this.setName("Override");
		
	}
	// fix the display of the infos for swimmer
	// the annotation is a comment for the compiler
	@Override
	public String displayInfo() {
		String infos=String.format("Olympian name : %s\nOlympian age : %s\n Olympian Energy : %s\nSwimm Speed:%s", this.getName(),this.getAge(),this.getEnergyLevel(),this.swimSpeed);
		return infos;
	}

	public void greet() {
		System.out.println("Hellooo!!");
	}
}
