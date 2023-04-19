/**
 * 
 */
package com.main.interface_example;

/**
 * @author Akash.d
 *
 */
public class StudentClonable implements Cloneable {

	int roll_no;
	int age;
	String first_name;
	String last_name;
	String gender;

	StudentClonable(int roll_no, int age, String f_name, String l_name, String gender) {
		this.roll_no = roll_no;
		this.age = age;
		this.first_name = f_name;
		this.last_name = l_name;
		this.gender = gender;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "StudentClonable [roll_no=" + roll_no + ", age=" + age + ", first_name=" + first_name + ", last_name="
				+ last_name + ", gender=" + gender + "]";
	}

}
