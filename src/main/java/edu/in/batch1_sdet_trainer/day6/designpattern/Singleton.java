package edu.in.batch1_sdet_trainer.day6.designpattern;

public class Singleton {

	private static Singleton singletonInstance;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singletonInstance==null) {
			singletonInstance=new Singleton();
		}
		return singletonInstance;
	}
}
