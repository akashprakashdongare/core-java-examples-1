/**
 * 
 */
package com.main.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Akash.d
 *
 */
public class TreeMap_2 {
	static class Student {
		String name;
		int age;
		int rollNo;

		public Student(String name, int age, int rollNo) {
			this.name = name;
			this.age = age;
			this.rollNo = rollNo;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
		}

	}

	static class StudentSort implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			System.out.println("\n in comparator : " + (s1.rollNo - s2.rollNo) + " s1 roll no : " + s1.rollNo
					+ " s2 roll no : " + s2.rollNo);
			return s1.rollNo - s2.rollNo;
		}

	}

	public static void main(String[] args) {
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>(new StudentSort());
		tm.put(new Student("A", 20, 100), 1000);
		tm.put(new Student("A", 10, 200), 2000);
		tm.put(new Student("A", 2, 1), 5000);
		tm.put(new Student("A", 50, 1500), 5000);
		tm.put(new Student("A", 1, 10), 10);
		tm.put(new Student("A", 12, 120), 1120);

		tm.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
