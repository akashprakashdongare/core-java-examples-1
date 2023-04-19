/**
 * 
 */
package com.main.hacker_rank;

/**
 * @author Akash.d
 *
 */
public class StringInput {
	public static void main(String[] args) {
		String str = "welcomeToJava";
		int split_val = 3;
		createStringArray(str, split_val);

	}

	private static void createStringArray(String str, int split_val) {
		String[] temp = new String[str.length()];
		int val = -1;
		char[] char_array = str.toCharArray();
		for (int i = 2; i < char_array.length; i++) {
			temp[++val] = Character.toString(char_array[i - 2]) + Character.toString(char_array[i - 1])
					+ Character.toString(char_array[i]);
		}
		StringInput.sortArray(temp, ++val);
	}

	public static void sortArray(String[] str_array, int split_val) {
		for (int i = 1; i < split_val; i++) {
			if (str_array[i - 1].charAt(0) > str_array[i].charAt(0)) {
				String temp = str_array[i - 1];
				str_array[i - 1] = str_array[i];
				str_array[i] = temp;
				i = 0;
			}
		}
		System.out.println("First : " + str_array[0]);
		System.out.println("Last : " + str_array[split_val - 1]);
	}

}
