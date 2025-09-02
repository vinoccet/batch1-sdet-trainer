package edu.in.batch1_sdet_trainer.day6.designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<TestCase> t = getTestCase("hello");
		if (t.isPresent()) {
			t.get();
		}

		System.out.println(t.orElse(new TestCase("test1", "pass")));
		System.out.println(t.map(testcase->testcase.getName()));
	}

	public static Optional<TestCase> getTestCase(String name) {
		// logic from db
		return Optional.ofNullable(new TestCase("test2", "pass"));

	}

}
