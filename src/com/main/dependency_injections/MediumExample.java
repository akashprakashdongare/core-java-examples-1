/**
 * 
 */
package com.main.dependency_injections;

/**
 * @author Akash.d
 *
 */
interface Client {
	void display(String message);
}

class Service implements Client {

	@Override
	public void display(String message) {
		System.out.println(message);

	}

}

public class MediumExample {
	public static void main(String[] args) {
		Client c = new Service();
		c.display("Implimentation class");
	}

}
