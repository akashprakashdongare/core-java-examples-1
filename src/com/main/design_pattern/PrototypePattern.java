/**
 * 
 */
package com.main.design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akash.d
 *
 */
class Vehicle1 implements Cloneable {

	private List<String> vehicleList;

	public Vehicle1() {
		this.vehicleList = new ArrayList<String>();
	}

	public Vehicle1(List<String> list) {
		this.vehicleList = list;
	}

	public void insertData() {
		vehicleList.add("Honda amaze");
		vehicleList.add("Audi A4");
		vehicleList.add("Hundai Creta");
		vehicleList.add("Maruti Baleno");
		vehicleList.add("Renault Duster");
	}

	public List<String> getVehicleList() {
		return this.vehicleList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp_list = new ArrayList<String>();
		for (String s : this.getVehicleList()) {
			temp_list.add(s);
		}
		return new Vehicle1(temp_list);
	}

}

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Vehicle1 v = new Vehicle1();
		v.insertData();

		Vehicle1 b = (Vehicle1) v.clone();
		List<String> list = b.getVehicleList();
		list.add("New Honda Amez");

		System.out.println("Vehicle List : " + v.getVehicleList());

		System.out.println("List : " + list);

		b.getVehicleList().remove("Audi A4");
		System.out.println(list);

	}

}
