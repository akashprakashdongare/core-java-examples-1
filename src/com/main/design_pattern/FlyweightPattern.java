/**
 * 
 */
package com.main.design_pattern;

import java.util.HashMap;
import java.util.Random;

/**
 * @author Akash.d
 *
 */

interface Employee {
	void assignSkill(String skill);

	void task();
}

class Developer implements Employee {

	private final String JOB;
	private String skill;

	public Developer() {
		JOB = "Fix the ISSUE";
	}

	@Override
	public void assignSkill(String skill) {
		this.skill = skill;

	}

	@Override
	public void task() {
		System.out.println("Developer with SKILL :" + this.skill + " with JOB : " + JOB);

	}

}

class Tester implements Employee {
	private final String JOB;
	private String skill;

	public Tester() {
		this.JOB = " Test the ISSUE";
	}

	@Override
	public void assignSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public void task() {
		System.out.println("Tester with SKILL : " + this.skill + " with JOB : " + JOB);
	}
}

class EmployeeFactory {
	private static HashMap<String, Employee> emp_map = new HashMap<>();

	public static Employee getEmployee(String type) {
		Employee emp = null;
		if (emp_map.get(type) != null)
			emp = emp_map.get(type);
		else {
			switch (type) {
			case "Developer":
				emp = new Developer();
				System.out.println("Create new developer object");
				break;
			case "Tester":
				emp = new Tester();
				System.out.println("Create new tester object");
				break;
			default:
				System.out.println("NO SUCH EMPLOYEE");
			}
			emp_map.put(type, emp);
		}
		return emp;
	}

}

public class FlyweightPattern {
	private static String[] emp_type = { "Developer", "Tester" };
	private static String[] emp_skill = { "Java", "C++", ".Net", "Python" };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Employee emp = EmployeeFactory.getEmployee(getRandomEmployee());
			emp.assignSkill(getRandomSkill());
			emp.task();
		}

	}

	private static String getRandomSkill() {
		Random r = new Random();
		int random_int = r.nextInt(emp_skill.length);
		return emp_skill[random_int];
	}

	private static String getRandomEmployee() {
		Random r = new Random();
		int random_int = r.nextInt(emp_type.length);
		return emp_type[random_int];
	}

}
