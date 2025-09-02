package edu.in.batch1_sdet_trainer.day1;

public class Car {
	

	private double milage;
	private String carName;
	private String color;
	private boolean isEV;
	


	public Car(double milage,String carName,String color,boolean isEV) {
		this.milage=milage;
		this.carName=carName;
		this.color=color;
		this.isEV=isEV;
	}
	
	// has-a
	private Engine engineType;
	public Engine getEngineType() {
		return engineType;
	}
	public void setEngineType(Engine engineType) {
		this.engineType = engineType;
	}


	
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isEV() {
		return isEV;
	}
	public void setEV(boolean isEV) {
		this.isEV = isEV;
	}
	
	public void drive() {
		System.out.println("I am driving a generic car");
	}
	
}
