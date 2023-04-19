/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class SwapWthoutThird {

	public static void main(String args[]) {

		int a = 70;
		int b = 20;
		int c = 40;

		swapNumber(a, b);
		swapNumber(a, b, c);

	}

	static void swapNumber(int a, int b) {
		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println(" a : " + a + "  b : " + b);
	}

	static void swapNumber(int a, int b, int c) {
		c = a + b + c;
		a = c - (a + b);
		b = c - (a + b);
		c = c - (a + b);
		
		
		System.out.println(" a : "+a +"  b : "+b+"  c : "+c);
	}

}
