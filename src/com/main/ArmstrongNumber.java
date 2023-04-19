/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class ArmstrongNumber {

	static int armstrongNo = 0;

	public static void main(String args[]) {

		String number = "407";
		armstrongNumber(number);
		System.out.println(Integer.parseInt(number) == armstrongNo ? " Armstrong no." : "Not an Armstrong no.");
	}

	static int armstrongNumber(String number) {
		String[] array = number.split("");

		for (int i = 0; i < array.length; i++) {
			int no_digits = array.length;
			int temp_no = 1;
			while (no_digits > 0) {
				temp_no = temp_no * Integer.parseInt(array[i]);
				no_digits--;
			}
			armstrongNo = armstrongNo + temp_no;
		}

		return armstrongNo;
	}

}
