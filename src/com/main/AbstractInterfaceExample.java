/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class AbstractInterfaceExample {
	public static void main(String[] args) {
		// AbstractImpl ai = new AbstractImpl(10, 20);
		// ai.addition();
		// ai.testAbstractMethod();
		// InterfaceImpl ii = new InterfaceImpl();
		// ii.defMethod();
		// ii.testMethod();
		// TestInterface.addition();
		AbstractClass.addition2();

		AbstractImpl.addition2();
	}

}

abstract class AbstractClass {
	static int a;
	static int b;

	public AbstractClass(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void addition() {
		System.out.println(" Abstract class addition : " + (a + b));
	}

	public static void addition2() {
		System.out.println(" Abstract class addition : " + (a + b));
	}

	public abstract void testAbstractMethod();

}

class AbstractImpl extends AbstractClass {
	int a;
	int b;

	public AbstractImpl(int a, int b) {
		super(a, b);
		this.a = a;
		this.b = b;
	}

	@Override
	public void testAbstractMethod() {
		System.out.println("Abstract class implemented method");

	}

	public void addition() {
		System.out.println(" AbstractImpl class addition : " + (a + b));
		super.addition();
	}

	public static void addition2() {
		System.out.println(" AbstractImpl class addition : ");
	}

}

interface TestInterface {
	static int a = 10;
	static int b = 20;

	public static void addition() {
		System.out.println("Addition in interface : " + (a + b));
	}

	public void testMethod();

	public default void defMethod() {
		System.out.println("Interface default method");
	}

}

class InterfaceImpl implements TestInterface {

	@Override
	public void testMethod() {
		System.out.println("InterfaceImpl class test method");

	}

	@Override
	public void defMethod() {
		System.out.println("InterfaceImpl class default method");
		TestInterface.super.defMethod();

	}

}
