package io.jacky.compare;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Student student1 = new Student(3, "Lucky", "Mantala", "Computer Science");
		Student student2 = new Student(2, "Tejas", "Mantala", "Business");
		Student student3 = new Student(1, "Akash", "Mantala", "Management");
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		System.out.println(students + "\n");
		
		students.sort(null);
		System.out.println("Default Sort using comparable compareTo method (rollno)");
		System.out.println(students);
		
		students.sort(new StudentFirstNameComparator());
		System.out.println("First name Sort");
		System.out.println(students);
		
		students.sort(new StudentDepartmentComparator());
		System.out.println("Department Sort");
		System.out.println(students);
		
	}

}
