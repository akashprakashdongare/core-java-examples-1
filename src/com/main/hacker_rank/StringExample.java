/**
 * 
 */
package com.main.hacker_rank;

/**
 * @author Akash.d
 *
 */
public class StringExample {
	public static void main(String[] args) {
		String A = "hello";
		String B = "java";

		System.out.println(printStringSize(A, B));
		System.out.println(printStringGretter(A, B));
		System.out.println(printStringConcat(A, B));

	}

	private static int printStringSize(String A, String B) {
		return (A.length() + B.length());
	}

	private static String printStringGretter(String A, String B) {
		char[] a_array = A.toCharArray();
		char[] b_array = B.toCharArray();

		return (a_array[0] > b_array[0] ? "Yes" : "No");
	}

	private static String printStringConcat(String A, String B) {
		String s1 = Character.toString(A.charAt(0));
		String s2 = Character.toString(B.charAt(0));

		return ((s1.toUpperCase() + A.substring(1)) + " " + (s2.toUpperCase() + B.substring(1)));
	}
}
