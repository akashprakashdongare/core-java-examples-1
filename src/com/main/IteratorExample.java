/**
 * 
 */
package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Akash.d
 *
 */
public class IteratorExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Alex");
		names.add("Bob");
		names.add("Charles");
		//System.out.println(names);

		ListIterator<String> listIterator = names.listIterator();

		// Add a value at any place using ListIterator
		while (listIterator.hasNext()) {
			listIterator.next();
			listIterator.add("Lokesh");
		}
		//System.out.println(names);

		listIterator = names.listIterator();

		// Set a value at any place using ListIterator
		while (listIterator.hasNext()) {
			listIterator.next();
			listIterator.set("John");
		}
		//System.out.println(names);
	}

}
