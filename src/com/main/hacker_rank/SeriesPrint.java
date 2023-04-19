/**
 * 
 */
package com.main.hacker_rank;

import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class SeriesPrint {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i<num;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			Series.printSeries(a, b, n);
		}
		*/
		Series.printSeries(5, 3, 5);
	}

}

class Series {
	public static void printSeries(int a, int b, int n) {
		if (n != 0) {
			for (int j = 0; j < n; j++) {
				int temp_values = 0;
				for (int k = 0; k <= j; k++) {
					temp_values =temp_values + ((k == 0) ? (a + (1 * b)) : (getValueSquere(2, k) * b));
				}
				System.out.print(temp_values + " ");
			}
			System.out.println();

		}

	}

	private static int getValueSquere(int number, int squre) {
		int res = 1;
		for (int i = 1; i <= squre; i++) {
			res = res * number;
		}
		return res;
	}
}
