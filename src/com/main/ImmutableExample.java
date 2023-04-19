/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
public class ImmutableExample {
	public static void main(String[] args) {
		Immutable obj = new Immutable("Immutable class", 10000);
		System.out.println("\n Name : " + obj.getName());
		System.out.println("\n Roll No : " + obj.getRollNo());

		ImmutableChield obj2 = new ImmutableChield("Immutable class chield", 1200, "21", "Indian");
		System.out.println("\n Name : " + obj2.getName());
		System.out.println("\n Roll No : " + obj2.getRollNo());
		System.out.println("\n Age : " + obj2.getAge());
		System.out.println("\n Nationality : " + obj2.getNationality());
	}

}

class Immutable {
	private final String name;
	private final int rollNo;

	public Immutable(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

}

class ImmutableChield extends Immutable {

	private final String age;
	private final String nationality;

	public ImmutableChield(String name, int rollNo, String age, String nationality) {
		super(name, rollNo);
		this.age = age;
		this.nationality = nationality;
	}

	public String getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

}