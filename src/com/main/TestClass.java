/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class TestClass {

	public static void main(String[] args) {
		OneMethod.goOne(1);
		OneMethod.goOne(2, 3);
	}

}

class OneMethod {
	final static void goOne(final int x) {
		System.out.print(x + " ");
	}

	final static void goOne(final int x, final int y) {
		System.out.print(x + " " + y);
	}
}