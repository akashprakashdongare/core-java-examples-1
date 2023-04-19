/**
 * 
 */
package com.main.method_reference;

/**
 * @author Akash.d
 *
 */
public class InstanceMethodReference {

	public static void main(String[] agrs) {

		ObjectReference obj = new ObjectReference();

		FunctionalInter fun_i = obj::additionOfTwoNumber;
		System.out.println("Object method reference : " + fun_i.addition(10, 50));

	}

}

interface FunctionalInter {
	int addition(int i, int j);
}

class ObjectReference {

	public int additionOfTwoNumber(int i, int j) {
		return i + j;
	}
}
