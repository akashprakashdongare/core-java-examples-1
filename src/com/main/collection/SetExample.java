/**
 * 
 */
package com.main.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Akash.d
 *
 */
public class SetExample {

	public static class ExampleClass {
		public static void testSetCollection() {
			Set<Integer> s = new HashSet<Integer>();
			s.add(null);
			s.add(null);
			s.add(null);
			s.add(null);

			s.add(4);
			s.add(7);
			s.add(2);
			s.add(3);
			s.add(5);
			System.out.println(s);
		}

		public static void testUserDefineSet() {
			Set<Employee2> set = new HashSet<Employee2>();
			set.add(new Employee2("Akash", "Dongare", "1619"));
			set.add(new Employee2("Beena", "Raghwani", "1612"));
			set.add(new Employee2("Samadhan", "More", "1621"));
			set.add(new Employee2("Akash", "Dongare", "1619"));
			
			set.forEach(System.out::println);
		}
	}

	public static void main(String[] args) {
		// ExampleClass.testSetCollection();
		ExampleClass.testUserDefineSet();
	}

}

class Employee2 implements Comparable<Employee2> {
	private String firstName;
	private String lastName;
	private String empCode;

	public Employee2(String firstName, String lastName, String empCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.empCode = empCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", empCode=" + empCode + "]";
	}

	@Override
	public int compareTo(Employee2 o) {
		if (empCode == o.empCode)
			return 0;
		return -1;
	}
}
