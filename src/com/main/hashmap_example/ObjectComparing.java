/**
 * 
 */
package com.main.hashmap_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class ObjectComparing {

	public static void main(String args[]) {

		List<Employee> lst = new ArrayList<Employee>();
		lst.add(new Employee("Akash Dongare", "9137331096", "akashdng12@gmail.com", "1619", "B+"));
		lst.add(new Employee("Samadhan More", "9137331096", "samadhanmore@gmail.com", "1621", "A+"));
		lst.add(new Employee("Beena Raghwani", "9137331096", "beenagaghwani@gmail.com", "1612", "B+"));
		lst.add(new Employee("Akash Dongare", "9137331096", "akashdng12@gmail.com", "1619", "B+"));

		System.out.println("List with duplicates : " + lst);
		System.out.println("List without duplicates : " + comparingObject(lst));

		System.out.println(" HashSet List : " + comparingWithHastSet(lst));

	}

	private static List<Employee> comparingObject(List<Employee> lst) {
		List<Employee> lst_new = new ArrayList<Employee>();

		for (Employee bean : lst) {
			boolean is_duplicate = true;

			if (lst_new.isEmpty() == false) {
				for (Employee bean2 : lst_new) {
					if (bean.getEmpCode().equals(bean2.getEmpCode()) == true)
						is_duplicate = false;
				}
			} else
				lst_new.add(bean);

			if (is_duplicate == false)
				lst_new.add(bean);
		}

		return lst_new;
	}

	private static HashSet<Employee> comparingWithHastSet(List<Employee> lst) {
		HashSet<Employee> set = new HashSet<Employee>();
		for (Employee bean : lst)
			set.add(bean);
		return set;
	}

}

class Employee {

	String empName = "";
	String mobileNo = "";
	String emailId = "";
	String empCode = "";
	String bloodGroup = "";

	public Employee(String empName, String mobileNo, String emailId, String empCode, String bloodGroup) {
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.empCode = empCode;
		this.bloodGroup = bloodGroup;

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "[empName=" + empName + ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", empCode=" + empCode
				+ ", bloodGroup=" + bloodGroup + "]";
	}

}
