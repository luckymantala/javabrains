package io.jacky.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListMain {
	public static void main(String[] args) {
		
		String firstNames[] = new String[10];
		firstNames[0] = "Tejas";
//		convert array to collection object
		List<String> fNames = Arrays.asList(firstNames);
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Lucky");
		names.add("Sakshi");
		names.addAll(fNames);
		System.out.println(names);
		
		names.set(4, "Pooja");
		System.out.println(names);
		
		names.add(4, "Tejal");
		System.out.println(names);
				
		boolean containsPooja = names.contains("Pooja");
		System.out.println(containsPooja);
		
		System.out.println(names.get(0));
		System.out.println(names.get(12));
		
		System.out.println(names.remove(0));
		System.out.println(names);
		
		System.out.println(names.remove("Tejas"));
		System.out.println(names);
		
		Student student1 = new Student(3, "Lucky", "Computer Science");
		Student student2 = new Student(2, "Tejas", "Business");
		Student student3 = new Student(1, "Akash", "Management");
		Student student4 = new Student(1, "Akash", "Management");
		
		ArrayList<Student> studs = new ArrayList<Student>();
		studs.add(student1); 
		studs.add(student2); 
		studs.add(student3); 
		
		System.out.println(studs.contains(student4));
		
	}
}

class Student {
	int id;
	String name;
	String dept;
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name);
	}
}
