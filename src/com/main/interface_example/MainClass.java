/**
 * 
 */
package com.main.interface_example;

/**
 * @author Akash.d
 *
 */
public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentClonable obj = new StudentClonable(10, 17, "Samir", "Pathak", "Male");
		System.out.println("Simple obj : " + obj);

		StudentClonable obj_clone = (StudentClonable) obj.clone();
		System.out.println("Cloned Object : " + obj_clone);
	}

}
