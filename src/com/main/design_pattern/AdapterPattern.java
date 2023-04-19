/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */
interface WebDriver {
	void getElement();

	void selectElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("Get element from ChromeDriver");

	}

	@Override
	public void selectElement() {
		System.out.println("Select element from ChromeDriver");

	}

}

class IEDriver {
	public void findElement() {
		System.out.println("Find element from IEDriver");
	}

	public void clickElemnt() {
		System.out.println("Click element from IEDriver");
	}
}

class WebDriverAdapter implements WebDriver {

	IEDriver iEDriver;

	public WebDriverAdapter(IEDriver iEDriver) {
		this.iEDriver = iEDriver;
	}

	@Override
	public void getElement() {
		iEDriver.findElement();

	}

	@Override
	public void selectElement() {
		iEDriver.clickElemnt();

	}

}

public class AdapterPattern {

	public static void main(String[] args) {
		ChromeDriver c_driver = new ChromeDriver();
		c_driver.getElement();
		c_driver.selectElement();

		IEDriver ie_driver = new IEDriver();
		ie_driver.findElement();
		ie_driver.clickElemnt();

		WebDriver web_driver = new WebDriverAdapter(ie_driver);
		web_driver.getElement();
		web_driver.selectElement();

	}

}
