/**
 * 
 */
package com.main.hacker_rank;

import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class Formatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String length = sc.next();
		printFormatting(input, length);
	}

	private static void printFormatting(String input, String lenght) {
		char[] char_array = lenght.toCharArray();
		String temp = "";
		if (char_array.length == 3)
			temp = lenght;
		else if (char_array.length == 2)
			temp = "0" + lenght;
		else if (char_array.length == 1)
			temp = "00" + lenght;

		System.out.printf("%-14s %s\n", input, temp);

	}

}
