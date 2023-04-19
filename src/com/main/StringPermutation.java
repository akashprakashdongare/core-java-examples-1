/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class StringPermutation {

	public static void main(String args[]) {

		String name = "ABC";
		displayPossibleStrings(name, 0, name.length());
	}

	static void displayPossibleStrings(String name, int start, int end) {
		if (start == end - 1)
			System.out.println(name);
		else {
			for (int i = start; i < end; i++) {
				name = swapString(name, start, i);
				displayPossibleStrings(name, start + 1, end);
				name = swapString(name, start, i);
			}

		}

	}

	static String swapString(String name, int start, int end) {
		char[] char_arry = name.toCharArray();
		char ch;
		ch = char_arry[start];
		char_arry[start] = char_arry[end];
		char_arry[end] = ch;
		return String.valueOf(char_arry);
	}

}
