/**
 * 
 */
package com.main;

import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class LambdaExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER A VALUE");
		int a = sc.nextInt();
		
		System.out.println("ENTER B VALUE");
		int b = sc.nextInt();

		AdditionInterface a_intf = (int i, int j) -> i * j;

		System.out.println("Addition of two no : " + a_intf.oprationMethod(a, b));

	}

}

interface AdditionInterface {

	int oprationMethod(int i, int j);

}
