package io.jacky.equals;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Lucky", "Mantala", "CS", new Date());
		Student student2 = new Student(1, "Lucky1", "Mantala", "CS", new Date());
		Student student3 = new Student(1, "Akash", "Mantala", "Management", new Date());
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		
		System.out.println("student1 hashcode " + student1.hashCode());
		System.out.println("student2 hashcode " + student2.hashCode());
		System.out.println("student3 hashcode " + student3.hashCode());
		
		
		
		
		
	}

}
