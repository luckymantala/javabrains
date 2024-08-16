package io.jacky.compare;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String firstname;
	private String lastname;
	private String department;

	public Student(int rollNo, String firstname, String lastname, String department) {
		super();
		this.rollNo = rollNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstname=" + firstname + ", lastname=" + lastname + ", department="
				+ department + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, firstname, lastname, rollNo);
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
		return Objects.equals(department, other.department) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && rollNo == other.rollNo;
	}
}

class StudentFirstNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getFirstname().compareTo(o2.getFirstname());
	}
}

class StudentDepartmentComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}
