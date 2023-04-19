/**
 * 
 */
package com.main.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class IteratorExample2 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		for (String s : emp.str)
			System.out.println(s);
	}

}

class Employee implements Iterable<String> {

	List<String> str = null;

	public Employee() {
		str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		str.add("F");
		str.add("G");
		str.add("H");
		str.add("I");
	}

	@Override
	public Iterator<String> iterator() {
		return str.iterator();
	}

}