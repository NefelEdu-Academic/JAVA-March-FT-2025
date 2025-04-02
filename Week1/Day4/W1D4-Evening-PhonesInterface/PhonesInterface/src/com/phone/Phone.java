package com.phone;

public abstract class Phone {
 // the attributes all the phones has (should always be private )
	private int batteryLife;
	private Long imei;
	
	// constructor 
	public Phone(int batteryLife, Long imei) {
		
		this.batteryLife = batteryLife;
		this.imei = imei;
	}
	
	//empty constructor
	public Phone() {}

	
	// getters and setters 
	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public Long getImei() {
		return imei;
	}

	public void setImei(Long imei) {
		this.imei = imei;
	};
	
	// abstract method for display info 
	// abstract method should be always implemented in child
	public abstract void displayInfo();
	
	
	
}
