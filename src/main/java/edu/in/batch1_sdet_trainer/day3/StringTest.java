package edu.in.batch1_sdet_trainer.day3;

public class StringTest {
	public static void main(String[] args) {
		String name = "vinoth";
		
		System.out.println(name);
		String otherName = "vinoth";
		String anotherName = new String("Vinoth");
		System.out.println(name==otherName);
		System.out.println(name==anotherName);
		addMoney(name,5000);
	}
	
	public static void addMoney(String accountHolderName, int money) {
		// validations
		
		// logic adding money to the respective account holder
	}
}
