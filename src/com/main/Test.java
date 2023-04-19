package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test class");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		System.out.println("Put Example : " + map.put(10, 20));

		System.out.println("Put Example : " + map.put(10, 30));

		System.out.println("Map : " + map);

		List<Integer> lst = new ArrayList<Integer>();

		System.out.println("Default array size : " + lst);

		Integer.valueOf("10");

	}

}
