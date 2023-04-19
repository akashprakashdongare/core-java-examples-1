/**
 * 
 */
package com.main.map;

import java.util.TreeMap;

/**
 * @author Akash.d
 *
 */
public class TreeMap_1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(10, "A");
		tm.put(20, "A");
		tm.put(30, "C");
		tm.put(40, "D");
		tm.put(50, "E");
		tm.put(60, "F");
		tm.put(70, "G");
		tm.put(80, "H");

		tm.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
