/**
 * 
 */
package com.main.array;

/**
 * @author Akash.d
 *
 */
public class MissingNumber {

	public static void main(String args[]) {
		// int[] temp_array = { 10, 20, 30, 40, 50, 70, 80, 100, 110, 140, 160 };
		int[] temp_array = { 1, 2, 3, 4, 5,6, 7, 8, 9, 10 };
		int n = temp_array.length + 1;
		int sum_n_number = ((n * (n + 1)) / 2);
		int sum_input = sumOfInputArray(temp_array);
		System.out.println("Missing No : " + (sum_n_number - sum_input));
	}

	static int sumOfInputArray(int[] temp_array) {
		int sum = 0;
		for (int i = 0; i < temp_array.length; i++)
			sum = sum + temp_array[i];
		return sum;
	}

}
