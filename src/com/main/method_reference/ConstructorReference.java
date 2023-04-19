/**
 * 
 */
package com.main.method_reference;

/**
 * @author Akash.d
 *
 */
public class ConstructorReference {

	public static void main(String[] args) {
		FunctionalInterface fun_i = Employee::new;
		System.out.println("Employee obj : "+fun_i.display(1619, 27, "Akash Dongare", "Waroli Washim"));

	}

}

interface FunctionalInterface {
	Employee display(int emp_code, int emp_age, String emp_name, String address);
}

class Employee {
	int emp_code;
	int emp_age;
	String emp_name;
	String address;

	Employee(int emp_code, int emp_age, String emp_name, String address) {
		this.emp_code = emp_code;
		this.emp_age = emp_age;
		this.emp_name = emp_name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [emp_code=" + emp_code + ", emp_age=" + emp_age + ", emp_name=" + emp_name + ", address="
				+ address + "]";
	}

}
