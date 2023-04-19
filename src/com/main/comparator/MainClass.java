/**
 * 
 */
package com.main.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Akash.d
 *
 */
public class MainClass {

	public static void main(String[] args) {

		List<Student> lst = new ArrayList<Student>();
		lst.add(new Student(16, 31, "RWRWRW"));
		lst.add(new Student(14, 29, "ABKJKS"));
		lst.add(new Student(15, 30, "GFDGDG"));
		lst.add(new Student(10, 25, "ABKJKS"));
		lst.add(new Student(12, 27, "FAFA"));
		lst.add(new Student(13, 28, "DFAFERE"));
		lst.add(new Student(11, 26, "DSADAS"));

		Collections.sort(lst, new AgeComparator());

		//Collections.sort(lst, new NameComparator());

		for (Student s : lst)
			System.out.println(s);

		Student std_max = Collections.max(lst, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getAge() > s2.getAge())
					return 1;
				else if (s1.getAge() < s2.getAge())
					return -1;
				return 0;

			}
		});
		System.out.println("Max student : " + std_max);

	}

}
