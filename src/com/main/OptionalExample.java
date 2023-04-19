/**
 * 
 */
package com.main;

import java.util.Optional;

/**
 * @author Akash.d
 *
 */
public class OptionalExample {
	public static void main(String[] args) {
		// withoutOptional();
		withOptional();
	}

	private static void withOptional() {
		String[] array = new String[10];
		array[5] = "Welcome to Optional";
		Optional<String> op = Optional.ofNullable(array[5]);

		if (op.isPresent())
			System.out.println(array[5].toLowerCase());
		else
			System.out.println("String is not available");

	}

	private static void withoutOptional() {
		String[] array = new String[10];
		System.out.println(array[5].toLowerCase());

	}

}
