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
public class ItrerableExample {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>() {
			{
				add("Akash Dongare");
				add("Beena Raghwani");
				add("Rohan Jha");
				add("Samadhan More");
				add("Shyam Gawande");
			}
		};

		//ItrebaleInt.byForEach(lst);
		//ItrebaleInt.byEnhance(lst);
		ItrebaleInt.byItrator(lst);
	}

}

class ItrebaleInt {

	public static void byForEach(List<String> lst) {
		lst.forEach(System.out::println);

	}

	public static void byItrator(List<String> lst) {
		Iterator<String> it = lst.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

	public static void byEnhance(List<String> lst) {
		for (String str : lst)
			System.out.println(str);

	}

}
