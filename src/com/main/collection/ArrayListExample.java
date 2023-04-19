/**
 * 
 */
package com.main.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Akash.d
 *
 */
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("F");
		lst.add("G");
		

		ListIterator<String> lst_itretor = lst.listIterator();

		while (lst_itretor.hasNext()) {
			lst_itretor.next();
			lst_itretor.set("S");
			lst_itretor.add("ABC");
		}
		System.out.println("List Iterator : " + lst);
	}

}
