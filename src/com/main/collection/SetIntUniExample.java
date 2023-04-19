/**
 * 
 */
package com.main.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Akash.d
 *
 */
public class SetIntUniExample {

	public static void main(String[] args) {

		Integer[] a = { 22, 45, 33, 66, 55, 34, 77 };
		Integer[] b = { 33, 2, 83, 45, 3, 12, 55 };

		Set<Integer> set_1 = new HashSet<Integer>();
		set_1.addAll(Arrays.asList(a));

		Set<Integer> set_2 = new HashSet<Integer>();
		set_2.addAll(Arrays.asList(b));

		Set<Integer> union_set = new HashSet<Integer>(set_1);
		union_set.addAll(set_2);

		//System.out.println(union_set);

		Set<Integer> intersect_set = new HashSet<Integer>(set_1);
		intersect_set.retainAll(set_2);

		System.out.println(intersect_set);

	}

}
