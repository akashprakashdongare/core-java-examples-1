/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class WeekDays {

	public static void main(String[] args) {
		int day = 8;
		getDayCalulations(day);
	}

	private static void getDayCalulations(int day) {

		if (day != 0)
			System.out.println(day / 7 + " week + " + day % 7 + " day");
		else
			System.out.println(" 0 week + 0 day");

	}

}
