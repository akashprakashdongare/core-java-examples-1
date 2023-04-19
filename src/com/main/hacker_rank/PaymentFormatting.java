/**
 * 
 */
package com.main.hacker_rank;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Akash.d
 *
 */
class Country {
	public static void printFormatting(double payment) {

		Locale.setDefault(new Locale("en","IN"));
		String india = NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.CHINA);
		String china = NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.US);
		String us = NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.FRANCE);
		String france = NumberFormat.getCurrencyInstance().format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}

public class PaymentFormatting {
	public static void main(String[] args) {
		Country.printFormatting(12220.20);
	}
}
