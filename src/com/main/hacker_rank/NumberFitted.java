/**
 * 
 */
package com.main.hacker_rank;

/**
 * @author Akash.d
 *
 */
public class NumberFitted {

	public static void main(String[] args) {
		long no = -150;
		printDataType(no);
	}

	private static void printDataType(long x) {
		try {
			if (x >= -128 && x <= 127)
				System.out.println(" * byte");

			if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
				System.out.println(" * short");

			if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
				System.out.println(" * int");

			if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
				System.out.println(" * long");

		} catch (Exception e) {
			System.out.println(x + " can't be fitted anywhere.");
		}

	}

}
