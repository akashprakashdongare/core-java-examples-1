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
interface Component {
	void showPrice();
}

class Leaf implements Component {
	int price;
	String name;

	public Leaf(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(" Name : " + name + " Price : " + price);

	}

}

class Composite implements Component {
	String name;
	List<Component> c_list = new ArrayList<Component>();

	public Composite(String name) {
		this.name = name;
	}

	public void addComponent(Component c) {
		c_list.add(c);
	}

	@Override
	public void showPrice() {
		System.out.println("Name : " + name);
		for (Component c : c_list)
			c.showPrice();

	}

}

public class CompositePattern_2 {

	public static void main(String[] args) {

		Component hd = new Leaf(1200, "HD");
		Component mouse = new Leaf(1400, "MOUSE");
		Component moniter = new Leaf(1800, "MONITER");
		Component ram = new Leaf(4000, "RAM");
		Component cpu = new Leaf(100000, "CPU");

		Composite peri = new Composite("Peripheral");
		Composite mother_b = new Composite("Mother-board");
		Composite computer = new Composite("Computer");
		Composite cabinate = new Composite("Cabinate");

		peri.addComponent(mouse);
		peri.addComponent(moniter);
		cabinate.addComponent(hd);
		cabinate.addComponent(mother_b);
		mother_b.addComponent(ram);
		mother_b.addComponent(cpu);
		computer.addComponent(peri);
		computer.addComponent(cabinate);

		// ram.showPrice();

		// peri.showPrice();

		computer.showPrice();
	}

}
