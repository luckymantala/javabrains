package io.jacky.equals;

import java.util.Date;
import java.util.Objects;

public class Student {
	private int rollNo;
	private String firstname;
	private String lastname;
	private String department;
	private Date lastModifiedTime;

	public Student(int rollNo, String firstname, String lastname, String department, Date lastModifiedTime) {
		super();
		this.rollNo = rollNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.lastModifiedTime = lastModifiedTime;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", firstname=" + firstname + ", lastname=" + lastname + ", department="
				+ department + ", lastModifiedTime=" + lastModifiedTime + "]";
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
