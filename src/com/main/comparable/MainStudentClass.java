/**
 * 
 */
package com.main.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class MainStudentClass {

	public static void main(String[] args) {
		List<Student> lst = new ArrayList<Student>();
		lst.add(new Student(10, 20, "ABC", "M"));
		lst.add(new Student(60, 50, "ABCADAS", "M"));
		lst.add(new Student(20, 22, "ABAC", "M"));
		lst.add(new Student(40, 26, "ABCADS", "M"));
		lst.add(new Student(30, 24, "ABCSA", "M"));
		lst.add(new Student(50, 28, "ABCASDA", "M"));

		Collections.sort(lst);

		for (Student s : lst)
			System.out.println(s);

	}

}
