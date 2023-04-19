/**
 * 
 */
package com.main.algorithams;

/**
 * @author Akash.d
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int index = binarySearchAlgo(array, 0, array.length - 1, 20);
		System.out.println("Index is : " + index);
	}

	private static int binarySearchAlgo(int[] array, int low, int high, int element) {

		if (high >= low) {
			int mid = low + ((high - low) / 2);
			if (array[mid] == element)
				return mid;

			if (array[mid] < element)
				return binarySearchAlgo(array, mid + 1, high, element);

			if (array[mid] > element)
				return binarySearchAlgo(array, low, mid - 1, element);
		}

		return -1;
	}

}
