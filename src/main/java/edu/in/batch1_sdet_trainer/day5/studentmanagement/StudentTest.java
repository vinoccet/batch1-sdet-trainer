package edu.in.batch1_sdet_trainer.day5.studentmanagement;

public class StudentTest {

	public static void main(String[] args) throws InterruptedException {
		String studentInfo="vinoth/cse/37";
		String[] splitInfo=studentInfo.split("/");
		Student student=new Student(splitInfo[0],splitInfo[1],Integer.parseInt(splitInfo[2]));
		StudentUtility studentUtility=new StudentUtility();
		studentUtility.getStudents().add(student);
		studentUtility.setStudentName(student.getName());
		
		Thread t=new Thread(studentUtility);
		
		t.start();
		t.join();
		System.out.println(studentUtility.getCount());

	}

}
