/**
 * 
 */
package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class AverageSalaryExample {

	public static void main(String[] args) {

		List<Employee> lst = new ArrayList<Employee>();
		lst.add(new Employee("JAVA", "AKASH DONGARE", 50000, 1619));
		lst.add(new Employee("JAVA", "ROHAN JHA", 60000, 1611));
		lst.add(new Employee("UI5", "BEENA RAGHWANI", 50000, 1612));
		lst.add(new Employee("UI5", "KOMAL WAGH", 50000, 1612));
		lst.add(new Employee("JAVA", "SACHIN BOLLU", 56000, 1512));

		getAverageSalary(lst);

	}

	static void getAverageSalary(List<Employee> lst) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		for (Employee emp : lst) {
			map.put(emp.getEmp_depart(),
					((map.containsKey(emp.getEmp_depart()) == true)
							? (map.get(emp.getEmp_depart()) + emp.getEmp_salary())
							: emp.getEmp_salary()));
			map.put(emp.getEmp_depart() + "_count",
					((map.containsKey(emp.getEmp_depart() + "_count") == true)
							? map.get(emp.getEmp_depart() + "_count") + 1
							: 1));
		}
		System.out.println(map);

		System.out.println("JAVA AVG SALARY : " + map.get("JAVA") / map.get("JAVA_count"));
		System.out.println("UI5 AVG SALARY : " + map.get("UI5") / map.get("UI5_count"));
	}

}

class Employee {
	private String emp_depart;
	private String emp_name;
	private double emp_salary;
	private int emp_code;

	public Employee(String depart, String name, double salary, int emp_code) {
		this.emp_depart = depart;
		this.emp_name = name;
		this.emp_salary = salary;
		this.emp_code = emp_code;
	}

	public String getEmp_depart() {
		return emp_depart;
	}

	public void setEmp_depart(String emp_depart) {
		this.emp_depart = emp_depart;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}

}
