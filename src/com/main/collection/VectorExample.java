/**
 * 
 */
package com.main.collection;

import java.util.Vector;

/**
 * @author Akash.d
 *
 */
public class VectorExample {

	public static class TestVector {
		public static void print() {
			Vector<Integer> vec = new Vector<Integer>();
			vec.add(10);
			vec.add(20);
			vec.add(30);
			vec.add(40);
			vec.add(50);
			vec.add(60);
			vec.add(70);
			vec.add(80);
			vec.add(90);
			vec.add(100);
			vec.add(110);
			vec.add(120);
			vec.add(130);
			vec.add(140);
			vec.add(150);
			vec.add(160);
			vec.add(170);
			vec.add(180);
			vec.add(190);
			vec.add(200);
			vec.add(210);
			// System.out.println(vec.capacity());

			Vector<Integer> vec_i = new Vector<Integer>(5);
			vec_i.add(10);
			vec_i.add(20);
			vec_i.add(30);
			vec_i.add(40);
			vec_i.add(50);
			vec_i.add(60);
			vec_i.add(70);
			vec_i.add(80);
			vec_i.add(90);
			vec_i.add(100);
			vec_i.add(110);
			System.out.println(vec_i.capacity());
		}

	}

	public static void main(String[] args) {
		TestVector.print();
	}

}
