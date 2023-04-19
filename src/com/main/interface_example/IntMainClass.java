/**
 * 
 */
package com.main.interface_example;

/**
 * @author Akash.d
 *
 */

class AdditionClass implements EmployeeInterface, EmployeeInterface2 {

	@Override
	public void addition() {
		int a = 10;
		int b = 20;
		System.out.println("Addition of two no. : " + (a + b));

	}

}

public class IntMainClass {

	public static void main(String[] args) {
		AdditionClass ac = new AdditionClass();
		ac.addition();
	}
}
