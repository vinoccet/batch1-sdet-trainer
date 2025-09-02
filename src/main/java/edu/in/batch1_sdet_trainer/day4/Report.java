package edu.in.batch1_sdet_trainer.day4;

@FunctionalInterface
public interface Report {
	
	public void report(String reporType);
	default void anotherReport() {
		System.out.println("default test");
	}

}
