/**
 * 
 */
package com.main.hacker_rank;

import java.math.BigDecimal;

/**
 * @author Akash.d
 *
 */
public class SortingArraySameOrder {
	public static void main(String[] args) {
		String[] array = { "9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
		SortBigDecimal.print(SortBigDecimal.sort(array));

	}

}

class SortBigDecimal {
	public static String[] sort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			int c = new BigDecimal(array[i - 1]).compareTo(new BigDecimal(array[i]));
			if (c < 0) {
				String temp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = temp;
				i = 0;
			}
		}
		return array;
	}

	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

}
