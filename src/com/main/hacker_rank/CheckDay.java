/**
 * 
 */
package com.main.hacker_rank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Akash.d
 *
 */
public class CheckDay {
	public static void main(String[] args) {
		System.out.println(DayOfWeek.getDayName(11, 18, 2021));
	}

}

class DayOfWeek {
	public static String getDayName(int month, int day, int year) {
		String response = "";
		try {
			String day_s = String.valueOf(day);
			String month_s = String.valueOf(month);
			String s = ((day_s.length() == 1) ? "0" + day_s : day_s)
					+ ((month_s.length() == 1) ? "0" + month_s : month_s) + String.valueOf(year);
			Date date = new SimpleDateFormat("ddMMyyyy").parse(s);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			response = new SimpleDateFormat("EEEE").format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return response.toUpperCase();
	}
}
