/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class FibonacciSeries {

	public static void main(String args[]) {

		// 1,1,2,3,5,8,13

		int size = 20;

		printFibonacciSeries(size);

	}

	static void printFibonacciSeries(int size) {
		int a = 0;
		int b = 1;
		int c = 0;
		int count = 1;

		while (count < size) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(c + "\t");
			count++;
		}
	}

}
