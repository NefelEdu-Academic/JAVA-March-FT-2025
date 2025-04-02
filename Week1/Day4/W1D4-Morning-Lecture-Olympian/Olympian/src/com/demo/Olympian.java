package com.demo;

public abstract class Olympian {
//member variables (characteristics)
	private String name;
	private int age;
	private double energyLevel;
	
	// constructor 
	public Olympian(String name,int age) {
		this.name=name;
		this.age=age;
		this.energyLevel=100.0;
	}
	
	
	// Methods : somethings that an instance or object can do 
	//setters and getters 

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(double energyLevel) {
		this.energyLevel = energyLevel;
	}

	// method to display info 
	// accessModifer returnType name (type args){}
	
	public String displayInfo() {
		String infos=String.format("Olympian name : %s\nOlympian age : %s\n Olympian Energy : %s", this.name,this.age,this.energyLevel);
		return infos;
	}
	public abstract void greet();
}
