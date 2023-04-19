/**
 * 
 */
package com.main.dependency_injections;

/**
 * @author Akash.d
 *
 */
class ClassA {
	public ClassA() {
		System.out.println("class A constructor");
	}

	public void display() {
		System.out.println("Display class A method");
	}
}

class ClassB extends ClassA {
	public ClassB() {
		System.out.println("class B constructor");
	}

	public void display() {
		System.out.println("Display class B method");
	}
}

public class ObjectCasting {
	public static void main(String[] args) {
		ClassA a = new ClassB();
		a.display();
	}

}
