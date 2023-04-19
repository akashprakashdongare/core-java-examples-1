/**
 * 
 */
package com.main;

import java.util.Date;

/**
 * @author Akash.d
 *
 */
public class FinallyBlockExample {
	public static void main(String[] args) {
		finallyExample();
		
		System.out.println("Java Date : "+new Date());
		System.out.println("Java SQL Date : "+new java.sql.Date(12));
	}

	private static void finallyExample() {
		try {
			int i = 10;
			int b = i / 0;
			return;
		} catch (Exception e) {
			System.out.println("\n In catch block : " + e.getMessage());
			return;
		} finally {

			System.out.println("\n Finally block...");
		}

	}

}
