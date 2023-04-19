/**
 * 
 */
package com.main.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class MethodReferenceExample {

	public static int compareByName(Person p, Person p1) {
		return p.getName().compareTo(p1.getName());
	}

	public static int compareByAge(Person p, Person p2) {
		return p.getAge().compareTo(p2.getAge());
	}

	public static void main(String[] args) {

		List<Person> lst = new ArrayList<Person>();
		lst.add(new Person("Abhishek", 20));
		lst.add(new Person("Shyam", 22));
		lst.add(new Person("Vinod", 25));
		lst.add(new Person("Ravi", 21));

		// Collections.sort(lst, MethodReferenceExample::compareByName);

		Collections.sort(lst, MethodReferenceExample::compareByAge);

		System.out.println("List sort by age : " + lst);

	}

}

class Person {
	private String name;
	private Integer age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
