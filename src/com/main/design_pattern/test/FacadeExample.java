/**
 * 
 */
package com.main.design_pattern.test;

/**
 * @author Akash.d
 *
 */

class Employee_2 {
	public static void printName(String name) {
		System.out.println("Print employee name : " + name);
	}

	public static void printAge(String age) {
		System.out.println("Print employee age : " + age);
	}
}

class Student_2 {
	public static void printName(String name) {
		System.out.println("Print student name : " + name);
	}

	public static void printAge(String age) {
		System.out.println("Print student age : " + age);
	}

}

class FacadeFactory {
	public static void printAsRequired(String obj_type, String value, String action) {
		if (obj_type.equals("emp")) {
			if (action.equals("age"))
				Employee_2.printAge(value);
			else
				Employee_2.printName(value);
		} else if (obj_type.equals("std")) {
			if (action.equals("age"))
				Student_2.printAge(value);
			else
				Student_2.printName(value);
		}

	}
}

public class FacadeExample {
	public static void main(String[] args) {
		FacadeFactory.printAsRequired("emp", "asasas sasa", "name");

		FacadeFactory.printAsRequired("std", "21", "age");
	}

}
