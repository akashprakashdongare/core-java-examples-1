/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */
public class FactoryDesignPattern {

	public static void main(String[] args) {

		Vehicle c_factory = VehicleFactory.getInstance("car", 4);
		System.out.println(c_factory);

		Vehicle b_factory = VehicleFactory.getInstance("bike", 2);
		System.out.println(b_factory);

	}

}

class VehicleFactory {

	public static Vehicle getInstance(String type, int wheel) {
		if (type == "car")
			return new Car(wheel);
		else if (type == "bike")
			return new Bike(wheel);

		return null;
	}
}

class Bike extends Vehicle {

	int wheel;

	Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return wheel;
	}

}

class Car extends Vehicle {

	int wheel;

	Car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return wheel;
	}

}

abstract class Vehicle {

	public abstract int getWheel();

	@Override
	public String toString() {
		return "Vehicle [Wheel = " + getWheel() + "]";
	}

}
