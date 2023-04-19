/**
 * 
 */
package com.main.hashmap_example;

import java.util.Collections;
import java.util.HashMap;

/**
 * @author Akash.d
 *
 */
public class SortingMap {

	public static void main(String args[]) {
		int[] array = { 10, 20, 10, 30, 40, 10, 20, 10, 30, 50, 60, 100, 100, 100, 100, 100, 100, 100 };
		System.out.println("sorted array : " + sotingArray(array));
		
		System.out.println("max value : " + Collections.max(sotingArray(array).values()));
	}

	private static HashMap<Integer, Integer> sotingArray(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++)
			map.put(array[i], (map.containsKey(array[i]) == true) ? map.get(array[i]) + 1 : 1);

		return map;
	}

}
