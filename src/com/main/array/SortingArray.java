/**
 * 
 */
package com.main.array;

/**
 * @author Akash.d
 *
 */
public class SortingArray {

	public static void main(String args[]) {
		int[] temp_array = { 10, 40, 50, 20, 30, 70, 90, 100, 5 };

		//sortArrayWithoutThird(temp_array);
		sortArrayWithThird(temp_array);
	}

	static void sortArrayWithoutThird(int[] temp_array) {
		for (int i = 1; i < temp_array.length; i++) {
			if (temp_array[i] < temp_array[i - 1]) {
				temp_array[i] = temp_array[i] + temp_array[i - 1];
				temp_array[i - 1] = temp_array[i] - temp_array[i - 1];
				temp_array[i] = temp_array[i] - temp_array[i - 1];
				i = 0;
			}
		}
		for (int i = 0; i < temp_array.length; i++)
			System.out.println(temp_array[i]);
	}

	static void sortArrayWithThird(int[] temp_array) {
		int temp_var;
		for (int i = 1; i < temp_array.length; i++) {
			if (temp_array[i] < temp_array[i - 1]) {
				temp_var = temp_array[i - 1];
				temp_array[i - 1] = temp_array[i];
				temp_array[i] = temp_var;
				i = 0;
			}
		}
		for (int i = 0; i < temp_array.length; i++)
			System.out.println(temp_array[i]);
	}

}
