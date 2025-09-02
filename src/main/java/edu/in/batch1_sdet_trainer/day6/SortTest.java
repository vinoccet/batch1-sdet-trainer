package edu.in.batch1_sdet_trainer.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
//		numList.add(10);
//		numList.add(20);
//		numList.add(5);
//		numList.add(100);
//		
//		String name="vinoth";
//		
//		Collections.sort(numList);
//		System.out.println(numList);

		// comparator and comparable

		Student student1 = new Student("vinoth", 37, 8);
		Student student2 = new Student("kumar", 30, 10);
		Student student3 = new Student("anand", 40, 6);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);

		Collections.sort(studentList);
		Collections.sort(studentList, (Student o1, Student o2) -> o1.getName().compareTo(o2.getName()));
		Collections.sort(studentList, (Student o1, Student o2) -> Integer.compare(o1.getGrade(), o2.getGrade()));

		System.out.println(studentList);
	}

}
