/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class IntegerPalindrome {

	public static void main(String args[]) {

		int number = 121121;
		String res = checkPalindrome(number);
		System.out.println(Integer.parseInt(res) == number ? "Palindrome" : "Not a Palindrome");
	}

	static String checkPalindrome(int number) {
		char[] char_array = (Integer.toString(number)).toCharArray();
		String res = "";
		for (int i = char_array.length - 1; i >= 0; i--)
			res = res + char_array[i];
		return res;
	}

}
