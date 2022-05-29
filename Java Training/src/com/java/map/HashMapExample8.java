package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample8 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rohan Roy");
		map.put(2, "Rahul Varma");

		System.out.println("Before : " + map);
		map.clear();
		System.out.println("After : " + map);

	}
}
