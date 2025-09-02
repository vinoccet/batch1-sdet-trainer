package edu.in.batch1_sdet_trainer.day4;

public class ObjectTest {

	public static void main(String[] args) {
		String name = "vinoth";
		String name1 = "vinoth";
		String name2 = new String("vinoth");

		Student s1 = new Student(1, "vinoth");
		Student s2 = new Student(1, "vinoth");
		Student s3 = new Student(2, "kumar");

		
		
//		System.out.println(name.equals(name1));
//		System.out.println(name.equals(name2));
//		System.out.println(name == name2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s2);
		
		System.out.println(s1);

	}

}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}