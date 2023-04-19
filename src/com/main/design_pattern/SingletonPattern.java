/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */
public class SingletonPattern {

	public static void main(String[] args) {

		// System.out.println(" Eagar instance hashcode 1 : " +
		// SingletonEagar.getInstance().hashCode());
		// System.out.println(" Eagar instance hashcode 2 : " +
		// SingletonEagar.getInstance().hashCode());

		// System.out.println(" Lazy instance hashcode 1 : " +
		// SingletonLazy.getInstance().hashCode());
		// System.out.println(" Lazy instance hashcode 2 : " +
		// SingletonLazy.getInstance().hashCode());

		//System.out.println(" Synchronized instance hashcode 1 : " + SingletonSynchronized.getInstance().hashCode());
		//System.out.println(" Synchronized instance hashcode 2 : " + SingletonSynchronized.getInstance().hashCode());
		
		System.out.println(" Synchronized instance hashcode 1 : " + SingletonSynchronizedBlock.getInstance().hashCode());
		System.out.println(" Synchronized instance hashcode 2 : " + SingletonSynchronizedBlock.getInstance().hashCode());

	}

}

class SingletonSynchronizedBlock {

	private static SingletonSynchronizedBlock instance;

	private SingletonSynchronizedBlock() {

	}

	public static SingletonSynchronizedBlock getInstance() {
		if (instance == null) {
			synchronized (SingletonSynchronizedBlock.class) {
				if (instance == null)
					instance = new SingletonSynchronizedBlock();
			}
		}
		return instance;
	}

}

class SingletonSynchronized {
	private static SingletonSynchronized instance;

	public static synchronized SingletonSynchronized getInstance() {
		if (instance == null)
			instance = new SingletonSynchronized();

		return instance;
	}
}

class SingletonLazy {

	private static SingletonLazy instance;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {
		if (instance == null)
			instance = new SingletonLazy();

		return instance;
	}

}

class SingletonEagar {
	private static SingletonEagar instance = new SingletonEagar();

	private SingletonEagar() {

	}

	public static SingletonEagar getInstance() {
		return instance;
	}
}
