/**
 * 
 */
package com.main.hacker_rank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class BigIntegerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		BigInteger a_b = new BigInteger(a);
		BigInteger b_b = new BigInteger(b);
		sc.close();

		System.out.println(a_b.add(b_b));
		System.out.println(a_b.multiply(b_b));
	}

	private static BigInteger getMultiplication(int a, int b) {
		return BigInteger.valueOf(a * b);
	}

	private static BigInteger getAddition(int a, int b) {
		return BigInteger.valueOf(a + b);
	}

}
