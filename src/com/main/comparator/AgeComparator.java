/**
 * 
 */
package com.main.comparator;

import java.util.Comparator;

/**
 * @author Akash.d
 *
 */
public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}

}
