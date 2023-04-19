/**
 * 
 */
package com.main.hacker_rank;

/**
 * @author Akash.d
 *
 */
public class OutputTesting {

	public static class Parent {
		static {
			System.out.println("Static block parent");
		}
		{
			System.out.println("Instance block parent");
		}

		public void displayInstanceMessage() {
			System.out.println("Parent display instance message method");

		}

		public static void displayStaticMessage() {
			System.out.println("Parent display static message method");

		}

	}

	public static class Child extends Parent {
		{
			System.out.println("Instance block child");
		}

		static {
			System.out.println("Static block child");
		}

		public void displayInstanceMessage() {
			System.out.println("Child display instance message method");

		}

		public static void displayStaticMessage() {
			System.out.println("Child display static message method");

		}

	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.displayInstanceMessage();
		p.displayStaticMessage();
	}

}
