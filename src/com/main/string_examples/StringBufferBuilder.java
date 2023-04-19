/**
 * 
 */
package com.main.string_examples;

/**
 * @author Akash.d
 *
 */
public class StringBufferBuilder {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");

		StringBuilder sbd1 = new StringBuilder("java");
		StringBuilder sbd2 = new StringBuilder("java");

		System.out.println("String equals : " + s1.equals(s2));

		System.out.println("StringBuffer equals : " + sb1.length());

		System.out.println("StringBuilder equals : " + sbd1.equals(sbd2));
	}

}
