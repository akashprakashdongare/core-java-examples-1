/**
 * 
 */
package com.main.hacker_rank;

import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class StandardOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;

		while (sc.hasNextLine()) {
			System.out.println(++i + " " + sc.nextLine());
		}
		sc.close();
	}

}
