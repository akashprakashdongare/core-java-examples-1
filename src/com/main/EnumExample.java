/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class EnumExample {

	public enum PizzaStatus {
		ORDERED, READY, DELIVERED;
	}

	public static void main(String[] args) {
		System.out.println(PizzaStatus.DELIVERED);
		System.out.println(PizzaStatus.READY);
		System.out.println(PizzaStatus.ORDERED);
	}

}
