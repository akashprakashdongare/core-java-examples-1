/**
 * 
 */
package com.main.map_interface;

/**
 * @author Akash.d
 *
 */
public class BinarySearchTest {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int index = binarySearch(array, 0, array.length - 1, 20);
		System.out.println(index);
	}

	private static int binarySearch(int[] array, int low, int high, int element) {
		if (high > low) {
			int mid = low + ((high - low) / 2);
			if (array[mid] == element)
				return mid;
			if (array[mid] < element)
				return binarySearch(array, mid + 1, high, element);
			if (array[mid] > element)
				return binarySearch(array, 0, mid, element);
		}
		return 0;
	}

}
