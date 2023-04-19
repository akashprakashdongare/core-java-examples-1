/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class MaxNumber {

	public static void main(String args[]) {
		 //int[] array = { 111, 50, 10, 20, 1000, 30, 40, 60, 70, 110, 200, 5, 1 };
		int[] array = { 85, 120, 46, 80, 90, 100 };
		
		//int[] array = { 993,902,17,1000000,100,210,901,871,921,421,271, 1234,1345, 10, 5, 93,0,12};
		getMaxNumber(array);
	}

	static int firstMax = 0;
	static int secondMax = 0;
	static int thirdMax = 0;
	static int fourthMax = 0;
	static int fifthMax = 0;

	private static void getMaxNumber(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] > firstMax) {
				fifthMax = fourthMax;
				fourthMax = thirdMax;
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = array[i];
			} else if (array[i] > secondMax && array[i] != firstMax) {
				fifthMax = fourthMax;
				fourthMax = thirdMax;
				thirdMax = secondMax;
				secondMax = array[i];
			} else if (array[i] > thirdMax && array[i] != secondMax) {
				fifthMax = fourthMax;
				fourthMax = thirdMax;
				thirdMax = array[i];
			} else if (array[i] > fourthMax && array[i] != thirdMax && array[i] != secondMax) {
				fifthMax = fourthMax;
				fourthMax = array[i];
			} else if (array[i] > fifthMax && array[i] != thirdMax && array[i] != secondMax && array[i] != fourthMax)
				fifthMax = array[i];

		}

		System.out.println("First Max No : " + firstMax);
		System.out.println("Second Max No : " + secondMax);
		System.out.println("Third Max No : " + thirdMax);
		System.out.println("Fourth Max No : " + fourthMax);
		System.out.println("Fifth Max No : " + fifthMax);
	}

}
