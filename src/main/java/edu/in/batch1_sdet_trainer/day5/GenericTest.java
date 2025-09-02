package edu.in.batch1_sdet_trainer.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		MyInteger myInteger=new MyInteger(10);
		myInteger.print();
		MyDouble myDouble=new MyDouble(10);
		myDouble.print();
		
		
		MyTypeClass<Dog> myInt=new MyTypeClass<>(new Dog());
		myInt.print();
		
//		MyTypeClass<Double> myDouble1=new MyTypeClass<>(10.0);
//		myDouble1.print();
		
		
		List<String> numbers=new ArrayList<>();
		
		numbers.add("hello");
		String value=numbers.get(0);

		

	}

	
	public static <T,V> void doSomething(T value,V value1, List<?> value2) {
		
	}
}
