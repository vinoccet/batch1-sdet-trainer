package edu.in.batch1_sdet_trainer.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			if(i%2==0) {
//				//ad to array
//			}
//			System.out.println(i);
//		}

		Report tc = new TestCase();
//		tc.report();
		Report rep = (type) -> System.out.println("test case passed" + type);

		provideReport(rep);

		Function<Double, Double> addition = (val) -> {
			return val + 100.0;
		};

		Function<Double, Double> sub = (val) -> {
			return val - 100.0;
		};
		
		addition.andThen(sub).apply(10.0);
		
		
		List<Integer> number=new ArrayList<>();
		
		number.add(10);
		number.add(13);
		number.add(7);
		number.add(9);
		number.add(10);
		
		number.stream().filter(num->num%2==0).map(num->num*num).forEach(num->System.out.println(""+num));
		
		
		
	}

	static void provideReport(Report rep) {
		rep.report("static report");
	}

}
