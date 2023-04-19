/**
 * 
 */
package com.main.design_pattern;

import java.sql.Driver;

/**
 * @author Akash.d
 *
 */
public class FacadePattern {

	public static void main(String[] args) {
		String test = "Check_Element_Present";
		
		WebExplorerHelperFacade.generateReports("firefox", "html", test);
		WebExplorerHelperFacade.generateReports("firefox", "junit", test);
		WebExplorerHelperFacade.generateReports("chrome", "html", test);
		WebExplorerHelperFacade.generateReports("chrome", "junit", test);

	}

}

class WebExplorerHelperFacade {
	public static void generateReports(String explore, String report, String test) {
		Driver driver = null;
		switch (explore) {
		case "firefox":
			driver = FireFox.getFirefoxDriver();
			switch (report) {
			case "html":
				FireFox.generateHTMLReport(test, driver);
				break;

			case "junit":
				FireFox.generateJUnitReport(test, driver);
				break;
			}
			break;
		case "chrome":
			driver = Chrome.getChromeDriver();
			switch (report) {
			case "html":
				Chrome.generateHTMLReport(test, driver);
				break;

			case "junit":
				Chrome.generateJUnitReport(test, driver);
				break;
			}

		}
	}
}

class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generate HTML Report for Chrome Driver");
	}

	public static void generateJUnitReport(String test, Driver driver) {
		System.out.println("Generate JUnit Report for Crome Driver");
	}
}

class FireFox {
	public static Driver getFirefoxDriver() {
		return null;
	}

	public static void generateHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML Report for FireFox Driver");
	}

	public static void generateJUnitReport(String test, Driver driver) {
		System.out.println("Generating JUnit Report for FireFox Driver");
	}

}
