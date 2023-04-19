/**
 * 
 */
package com.main.collection;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Akash.d
 *
 */
public class HashmapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1000001111);
		map.put("B", 1000001111);
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}
