/**
 * 
 */
package com.main.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Akash.d
 *
 */
class Student {

	private String name;
	private int age;
	private int rollNo;

	public Student(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals methos");
		boolean is_equal = false;
		if (obj instanceof Student) {
			Student st = (Student) obj;
			if (st.age == this.age && st.name.equals(this.name))
				is_equal = true;
		}
		return is_equal;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode method");
		int hashcode = age * 20 + name.hashCode();
		return hashcode;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
	}

}

public class HashmapExample {

	private static class Example {
		public static void testMethod() {
			Map<Student, Student> map = new HashMap<Student, Student>();
			map.put(new Student("Akash Dongare", 22, 1201), new Student("Akash Dongare", 22, 1201));
			map.put(new Student("Akash Dongare", 22, 1201), new Student("Akash Dongare", 22, 1201));
			map.forEach((k, v) -> {
				System.out.println(k + " : " + v);
			});
		}
	}

	public static void main(String[] args) {
		Example.testMethod();
	}
}
