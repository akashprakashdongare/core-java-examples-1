/**
 * 
 */
package com.main.hacker_rank;

import java.util.Scanner;

/**
 * @author Akash.d
 *
 */
public class StaticBlock {
	static int B;
	static int H;
	static boolean flag = true;

	static {
		try {
			Scanner sc = new Scanner(System.in);
			B = sc.nextInt();
			H = sc.nextInt();
			if (B < 0 || B == 0) {
				flag = false;
				int j = B / 0;
			}
			if (H < 0 || H == 0) {
				flag = false;
				int j = B / 0;
			}
		} catch (Exception e) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}

	}

	public static void main(String[] args) throws Exception {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}

}
