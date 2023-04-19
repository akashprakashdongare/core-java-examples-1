/**
 * 
 */
package com.main.array;

/**
 * @author Akash.d
 *
 */
public class MissingMultNumber {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 7, 9, 9, 5};
		int[] temp_array = new int[100];

		for (int i : array)
			temp_array[i] = 1;

		int max_no = findMaxNumber(array);

		for (int i = 1; i < max_no; i++) {
			if (temp_array[i] == 0)
				System.err.print(i + "\t");
		}

	}

	public static int findMaxNumber(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}

}
