/**
 * 
 */
package com.main.design_pattern.test;

/**
 * @author Akash.d
 *
 */

class SingletonFactory {

	public static SingletonFactory instance;

	private SingletonFactory() {
		System.out.println("SingletonFactory constructor......");
	}

	public static SingletonFactory getInstance() {
		if (instance == null)
			instance = new SingletonFactory();
		return instance;
	}

}

public class SingletonExample {

	public static void main(String[] args) {

		SingletonFactory.getInstance();
		SingletonFactory.getInstance();
		SingletonFactory.getInstance();
		SingletonFactory.getInstance();
		;

	}

}
