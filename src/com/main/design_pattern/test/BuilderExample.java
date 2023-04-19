/**
 * 
 */
package com.main.design_pattern.test;

/**
 * @author Akash.d
 *
 */
class Vehicle_2 {
	int wheel;
	String engine;

	// optional parameter
	int airbag;

	public Vehicle_2(VehicleBuilder_2 ve) {
		this.wheel = ve.wheel;
		this.engine = ve.engine;
		this.airbag = ve.airbag;
	}

}

class VehicleBuilder_2 {
	int wheel;
	String engine;

	int airbag;

	public VehicleBuilder_2(int wheel, String engine) {
		this.wheel = wheel;
		this.engine = engine;
	}

	public VehicleBuilder_2 setAirbag(int airbag) {
		this.airbag = airbag;
		return this;
	}

	public Vehicle_2 build() {
		return new Vehicle_2(this);
	}

}

public class BuilderExample {
	public static void main(String[] args) {
		Vehicle_2 bike = new VehicleBuilder_2(2, "bike").build();

		Vehicle_2 car = new VehicleBuilder_2(2, "car").setAirbag(2).build();
	}
}
