/**
 * 
 */
package com.main.comparable;

/**
 * @author Akash.d
 *
 */
public class Student implements Comparable<Student> {

	int rollNo;
	int age;
	String name;
	String gender;

	Student(int rollNo, int age, String name, String gender) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int compareTo(Student o) {

		if (age == o.age)
			return 0;
		else if (age < o.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}

}
