/**
 * 
 */
package com.main.method_reference;

/**
 * @author Akash.d
 *
 */
public class StaticMethodRefe {

	public static void main(String[] args) {

		FunInterface fun_i = MethodReference::displayMessage;
		System.out.println("Addition of two no : "+fun_i.display(2, 5));

	}

}

interface FunInterface {

	int display(int i, int j);

}

class MethodReference {

	public static int displayMessage(int i, int j) {
		return i + j;
	}

}
