/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Addition ad = (a, b) -> a + b;

		System.out.println("Addition : " + ad.additon(5, 10));
		
		System.out.println("Subtract : " + ad.sunbtrsact(10, 5));

	}

}

@FunctionalInterface
interface Addition {
	int additon(int i, int b);

	default int sunbtrsact(int i, int b) {
		return i - b;
	}
}
