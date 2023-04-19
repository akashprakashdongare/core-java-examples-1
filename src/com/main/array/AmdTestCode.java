/**
 * 
 */
package com.main.array;

/**
 * @author Akash.d
 *
 */
public class AmdTestCode {

	public static void main(String[] args) {
		int row = 3;
		int col = 3;
		int def = 1;
		int[][] array_2d = new int[row][col];
		array_2d[0][0] = 5;
		array_2d[0][1] = 5;
		array_2d[1][0] = 3;
		array_2d[1][1] = 8;
		array_2d[1][2] = 9;
		array_2d[2][0] = 6;
		array_2d[2][1] = 10;

		System.out.println("Sum of digonal : "
				+ Array2D.printArray(Array2D.updateAbsentToDefault(array_2d, row, col, def), row, col));

	}

}

class Array2D {
	static int first;
	static boolean first_flag = true;
	static int second;
	static boolean second_flag = true;
	static int third;
	static boolean third_flag = true;

	public static int[][] updateAbsentToDefault(int[][] array_2d, int row, int col, int def) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (array_2d[i][j] == 0)
					array_2d[i][j] = def;
				if (i == j) {
					if (i == 0)
						first = array_2d[i][j];
					else if (i == 1)
						second = array_2d[i][j];
					else if (j == 2)
						third = array_2d[i][j];
				}
			}
		}
		System.out.println(" first : " + first);
		System.out.println(" second : " + second);
		System.out.println(" third : " + third);
		return array_2d;
	}

	public static int printArray(int[][] array_2d, int row, int col) {
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i != j) {
					if (array_2d[i][j] == first)
						first_flag = false;
					if (array_2d[i][j] == second)
						second_flag = false;
					if (array_2d[i][j] == third)
						third_flag = false;
				}
			}
		}
		if (first_flag)
			sum = sum + first;
		if (second_flag)
			sum = sum + second;
		if (third_flag)
			sum = sum + third;

		return sum;
	}

}
