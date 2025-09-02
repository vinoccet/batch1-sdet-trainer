package edu.in.batch1_sdet_trainer.day1;

public class Logger {
	private String levels;

	// method overloading
	public void log() {
		System.out.println("generic logger"+this.levels);
	}
	public void log(String value) {
		System.out.println("generic logger with value"+value);
	}
	
	public void log(String value,int level) {
		System.out.println("generic logger with value"+value);
	}
	
	
	// polymorphism - compile (overloading) polymorphism and run time polymorphism(overriding)
	String name="vinoth";
	
}



