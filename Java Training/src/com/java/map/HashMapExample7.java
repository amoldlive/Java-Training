package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample7 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rohan Roy");
		map.put(2, "Rahul Varma");
		map.put(null, null);
		map.put(null, "ABC");
		map.put(3, null);
		map.put(4, null);

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
