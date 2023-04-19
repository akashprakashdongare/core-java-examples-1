/**
 * 
 */
package com.main.design_pattern.test;

/**
 * @author Akash.d
 *
 */
interface Vehicle {
	public int getWheel(int wheel);
}

class Car implements Vehicle {
	int wheel;

	public Car(int wheel) {
		System.out.println("Car constructor........");
		this.wheel = wheel;
	}

	@Override
	public int getWheel(int wheel) {
		return wheel;

	}
}

class Bike implements Vehicle {
	int wheel;

	public Bike(int wheel) {
		System.out.println("Bike constructor........");
		this.wheel = wheel;
	}

	@Override
	public int getWheel(int wheel) {
		return wheel;
	}

}

class VehicleFactory {

	public static Vehicle getInstance(int wheel, String type) {
		Vehicle obj = null;
		if (type.equals("car"))
			return new Car(wheel);
		else if (type.equals("bike"))
			return new Bike(wheel);

		return obj;
	}
}

public class FactoryExample {
	public static void main(String[] args) {

		VehicleFactory.getInstance(4, "car");
		VehicleFactory.getInstance(2, "bike");

	}

}
