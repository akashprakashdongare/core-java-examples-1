/**
 * 
 */
package com.main.array;

import java.util.HashMap;

/**
 * @author Akash.d
 *
 */
public class SumOfPairEqual {

	public static void main(String[] args) {
		int[] array = { 2, 4, 3, 5, 6, 4, 7, 8, 9 };
		int sum = 7;
		System.out.println(displayPairs(array, sum));
	}

	public static HashMap<String, String> displayPairs(int[] array, int sum) {
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) == sum)
					map.put("(" + array[i] + "," + array[j] + ")", "(" + array[i] + "," + array[j] + ")");
			}
		}
		return map;
	}

}
