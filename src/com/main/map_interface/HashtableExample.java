/**
 * 
 */
package com.main.map_interface;

import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * @author Akash.d
 *
 */
class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		boolean is_equal = false;
		Student s = (Student) obj;
		if (this.rollNo == s.rollNo && this.name.equals(s.name))
			is_equal= true;
		else
			is_equal= false;
		System.out.println(" Is Equal : "+is_equal);
		return is_equal;
	}

	@Override
	public int hashCode() {
		int hashcode =20+ name.hashCode();
		return hashcode;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", rollNo=" + rollNo + "]";
	}
	

}

public class HashtableExample {

	public static void main(String[] args) {
		// hashTable();
		//linkHashMap();
		linkHashmapUserdefine();
	}

	private static void linkHashmapUserdefine() {
		LinkedHashMap<Student, Integer> l_map = new LinkedHashMap<Student, Integer>();
		System.out.println(l_map.put(new Student("Akash Dongare", 1619), 200));
		System.out.println(l_map.put(new Student("Beena Raghwani", 1612), 400));
		System.out.println(l_map.put(new Student("Akash Dongare", 1619), 500));
		System.out.println(l_map.put(new Student("Rohan Jha", 1614), 500));
		System.out.println(l_map.put(new Student("Akash Dongare", 1212), 1200));
		System.out.println(l_map);
		

	}

	private static void linkHashMap() {
		LinkedHashMap<String, Integer> l_map = new LinkedHashMap<String, Integer>();

		System.out.println(l_map.put("D", 400));
		System.out.println(l_map.put("A", 400));
		System.out.println(l_map.put("S", 1200));
		System.out.println(l_map.put("B", 900));
		System.out.println(l_map.put("A", 100));
		System.out.println(l_map.put("B", 200));
		System.out.println(l_map.put("C", 300));
		System.out.println(l_map);

	}

	private static void hashTable() {
		Hashtable<String, Integer> h_table = new Hashtable<String, Integer>();
		h_table.put("A", 100);
		h_table.put("B", 200);
		h_table.put("C", 300);
		h_table.put("D", 400);
		h_table.put("A", 400);
		h_table.put("B", 900);
		System.out.println(h_table.size());
		System.out.println(h_table);

	}

}
