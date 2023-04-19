/**
 * 
 */
package com.main.array;

import java.util.HashMap;

/**
 * @author Akash.d
 *
 */
public class DuplicateNumbers {

	public static void main(String args[]) {

		int[] temp_array = { 10, 10, 20, 30, 40, 50, 4, 20,4 };
		//HashMap<Integer, Integer> res = findDuplicateNumbers(temp_array);
		HashMap<Integer, Integer> res = findDuplicateNumbers2(temp_array);
		System.out.println(" Duplicate Array : " + res);
	}

	static HashMap<Integer, Integer> findDuplicateNumbers(int[] temp_array) {
		HashMap<Integer, Integer> dup_lst = new HashMap<Integer, Integer>();

		for (int i = 0; i < temp_array.length; i++) {
			boolean is_duplicate = false;
			if (i == 0)
				dup_lst.put(temp_array[i], 1);
			else {
				if (dup_lst.containsKey(temp_array[i]) == true)
					is_duplicate = true;
				if (is_duplicate)
					dup_lst.put(temp_array[i],
							(dup_lst.containsKey(temp_array[i]) == true) ? (dup_lst.get(temp_array[i]) + 1) : 1);
			}

		}
		return dup_lst;
	}

	static HashMap<Integer, Integer> findDuplicateNumbers2(int[] temp_array) {
		HashMap<Integer, Integer> dup_lst = new HashMap<Integer, Integer>();

		for (int i = 0; i < temp_array.length; i++) {
			for (int j = i+1; j < temp_array.length; j++) {
				if (temp_array[i] == temp_array[j])
					dup_lst.put(temp_array[i],
							(dup_lst.containsKey(temp_array[i]) == true) ? (dup_lst.get(temp_array[i]) + 1) : 1);
			}

		}
		return dup_lst;
	}
}
