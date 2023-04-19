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
interface Observer {
	void update(String location);
}

interface Subject {
	void register(Observer obj);

	void unregister(Observer obj);

	void notificationObserver();

}

class DeliveryData implements Subject {

	private List<Observer> observers;
	private String location;

	public DeliveryData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {
		observers.add(obj);

	}

	@Override
	public void unregister(Observer obj) {
		this.observers.remove(obj);

	}

	@Override
	public void notificationObserver() {
		for (Observer obj : observers)
			obj.update(location);

	}

	public void locationChanged() {
		this.location = getLocation();
		notificationObserver();

	}

	public String getLocation() {
		return "YPlace";
	}

}

class Seller implements Observer {
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();

	}

	public void showLocation() {
		System.out.println("Notification at Seller -  Current Location : " + location);

	}

}

class User implements Observer {
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();

	}

	private void showLocation() {
		System.out.println("Notification at User - Current Location : " + location);

	}

}

class DeliveryWareHouse implements Observer {
	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}

	private void showLocation() {
		System.out.println("Notification at Warehouse - Current Location : " + location);

	}

}

public class ObservePattern {

	public static void main(String[] args) {

		DeliveryData topic = new DeliveryData();

		Observer seller_obj = new Seller();
		Observer user_obj = new User();
		Observer ware_obj = new DeliveryWareHouse();
		
		topic.register(seller_obj);
		topic.register(user_obj);
		topic.register(ware_obj);
		
		topic.locationChanged();
		
		topic.unregister(user_obj);
		
		System.out.println();
		topic.locationChanged();

	}

}
