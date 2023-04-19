/**
 * 
 */
package com.main.array;

/**
 * @author Akash.d
 *
 */
public class ArrayHourglass {
	public static void main(String[] args) {

		int row = 5;
		int col = 5;
		int[][] array_2d = { { 1, 1, 1, 0, 0, 0 }, 
				             { 0, 1, 0, 0, 0, 0 }, 
				             { 1, 1, 1, 0, 0, 0 }, 
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 }};

		int res = HourGlass.findMaxSum(array_2d, row, col);
		System.out.println("Result : " + (res > 0) != null ? res : " Not possible");

	}

}

class HourGlass {

	public static int findMaxSum(int[][] array_2d, int row, int col) {
		int max_sum = 0;
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				int sum = ((array_2d[i][j] + array_2d[i][j + 1] + array_2d[i][j + 2]) + (array_2d[i + 1][j + 1])
						+ (array_2d[i + 2][j] + array_2d[i + 2][j + 1] + array_2d[i + 2][j + 2]));
				System.out.println("Sum : " + sum);
				if (sum > max_sum)
					max_sum = sum;
			}
		}
		return max_sum;
	}

}
