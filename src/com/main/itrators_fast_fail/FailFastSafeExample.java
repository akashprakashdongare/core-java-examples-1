/**
 * 
 */
package com.main.itrators_fast_fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Akash.d
 *
 */
public class FailFastSafeExample {
	public static void main(String[] args) {
		failFastExample();
		//failSafeExample();
		
	}

	private static void failSafeExample() {
		ConcurrentHashMap<String, Integer> c_map = new ConcurrentHashMap<>();
		c_map.put("A", 10);
		c_map.put("B", 20);
		c_map.put("C", 30);
		c_map.put("D", 40);
		c_map.put("E", 50);

		Iterator<String> it = c_map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			c_map.put("F", 60);
			c_map.put("G", 70);
		}

	}

	private static void failFastExample() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		Iterator<Integer> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			if(it.next()==20) {
				it.remove();
			}
		}
		System.out.println("IN Next");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
