/**
 * 
 */
package com.main.design_pattern.test;

/**
 * @author Akash.d
 *
 */
public class ArrayMax {

	public static void main(String[] args) {
		// int[] array_int = { 10, 30, 40, 60, 5, 50 };
		int[] array_int = { 111, 50, 10, 20, 1000, 30, 40, 60, 70, 110, 200, 5, 1 };

		maxArrayValue(array_int);
	}

	private static void maxArrayValue(int[] array_int) {
		int first_max = 0;
		int second_max = 0;
		int third_max = 0;
		int four_max = 0;
		
		for (int i = 0; i < array_int.length; i++) {
			if (array_int[i] > first_max) {
				four_max = third_max;
				third_max = second_max;
				second_max = first_max;
				first_max = array_int[i];
			} else if (array_int[i] > second_max && array_int[i] != first_max) {
				four_max = third_max;
				third_max = second_max;
				second_max = array_int[i];
			} else if (array_int[i] > third_max && second_max != array_int[i] && array_int[i] != first_max) {
				four_max = third_max;
				third_max = array_int[i];
			} else if (array_int[i] > four_max && array_int[i] != third_max && second_max != array_int[i]
					&& array_int[i] != first_max) {
				four_max = array_int[i];
			}
		}
		System.out.println("First max value : " + first_max);
		System.out.println("Second max value : " + second_max);
		System.out.println("Third max value : " + third_max);
		System.out.println("Four max value : " + four_max);
	}

}
