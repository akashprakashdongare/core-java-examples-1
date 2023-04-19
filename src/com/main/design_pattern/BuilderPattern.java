/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */

class Vehicles {

	// required parameter
	private String engine;
	private int wheel;

	// optinal parameter
	private int airbags;

	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	public int getAirbags() {
		return airbags;
	}

	private Vehicles(VehicleBuilder vahicleBilder) {
		this.engine = vahicleBilder.engine;
		this.wheel = vahicleBilder.wheel;
		this.airbags = vahicleBilder.airbags;

	}

	public static class VehicleBuilder {

		private String engine;
		private int wheel;

		private int airbags;

		public VehicleBuilder(String engine, int wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}

		public Vehicles build() {
			return new Vehicles(this);
		}

	}

}

public class BuilderPattern {

	public static void main(String[] args) {

		Vehicles car = new Vehicles.VehicleBuilder("1500cc", 4).setAirbags(4).build();

		Vehicles bike = new Vehicles.VehicleBuilder("150cc", 2).build();

		System.out.println("Car Engine : " + car.getEngine());
		System.out.println("Car Engine : " + car.getWheel());
		System.out.println("Car Engine : " + car.getAirbags());

		System.out.println("Bike Engine : " + bike.getEngine());
		System.out.println("Bike wheel : " + bike.getWheel());

	}

}
