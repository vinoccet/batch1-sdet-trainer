package edu.in.batch1_sdet_trainer.day5.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentUtility implements Runnable {

	private List<Student> students=new ArrayList<>();
	private String studentName;
	private long count;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudent(List<Student> students) {
		this.students = students;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getCount() {
		return count;
	}

	@Override
	public void run() {
//		synchronized (this) {
			count = students.stream().filter(student -> student.getName().equals(studentName)).count();
//		}
			
			System.out.println();
	}

}
