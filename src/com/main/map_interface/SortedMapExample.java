/**
 * 
 */
package com.main.map_interface;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Akash.d
 *
 */
class Employee {
	String name;
	int rollNo;

	public Employee(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", rollNo=" + rollNo + "]";
	}

}

class EmployeeSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.rollNo == o2.rollNo)
			return 0;
		else if (o1.rollNo < o2.rollNo)
			return 1;
		return -1;
	}

}

public class SortedMapExample {
	public static void main(String[] args) {
		// sortedExample();
		sortedExampleUserdefine();
	}

	private static void sortedExampleUserdefine() {
		SortedMap<Employee, Integer> s_map = new TreeMap<Employee, Integer>(new EmployeeSort());
		s_map.put(new Employee("Akash Dongare", 1619), 1290);
		s_map.put(new Employee("Beena Raghwani", 1612), 1290);
		s_map.put(new Employee("Shyam Gawande", 1721), 1290);
		s_map.put(new Employee("Gopal Pawor", 1612), 1290);
		s_map.put(new Employee("Vicky Bhai", 1111), 1290);
		s_map.put(new Employee("Vinod Satpute", 1231), 1290);

		s_map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

	}

	private static void sortedExample() {
		SortedMap<Integer, String> s_map = new TreeMap<Integer, String>();
		s_map.put(1, "A");
		s_map.put(5, "B");
		s_map.put(12, "D");
		s_map.put(0, "S");
		s_map.put(4, "H");
		s_map.put(11, "S");
		s_map.put(44, "G");
		System.out.println(s_map);

	}

}
