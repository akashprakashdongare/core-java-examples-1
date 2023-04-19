/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class SingletonExample {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		Singleton s5 = Singleton.getInstance();
		
		System.out.println("Hash-code of Singleton obj : "+s.hashCode());
		System.out.println("Hash-code of Singleton obj1 : "+s1.hashCode());
		System.out.println("Hash-code of Singleton obj2 : "+s2.hashCode());
		System.out.println("Hash-code of Singleton obj3 : "+s3.hashCode());
		
		System.out.println("Hash-code of Singleton obj5 : "+s5.hashCode());

	}

}

class Singleton {
	private static Singleton signleton_obj = null;
	public String s;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (signleton_obj == null)
			signleton_obj = new Singleton();
		return signleton_obj;
	}

}
