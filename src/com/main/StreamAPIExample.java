/**
 * 
 */
package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Akash.d
 *
 */
public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> lst_num = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> lst_square = lst_num.stream().map(i -> i * i).collect(Collectors.toList());

		List<Integer> lst_filter = lst_square.stream().filter(i -> (i > 10 && i < 70)).collect(Collectors.toList());

		System.out.println("Square List : " + lst_square);

		System.out.println("Filter List : " + lst_filter);

		Integer even_reduce = lst_num.stream().filter(i -> ((i % 2) == 0)).reduce(0, (ans, i) -> ans + 1);

		System.out.println("Even No Reduce : " + even_reduce);

		List<Integer> lst_even = lst_num.stream().filter(i -> (i % 2) == 0).collect(Collectors.toList());

		System.out.println("Even No List : " + lst_even);

	}

}
