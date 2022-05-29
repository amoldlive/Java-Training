package com.java.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample1 {
	public static void main(String[] args) {

		//maintains insertion order
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();

		lmap.put(4, "Rohan Roy");
		lmap.put(2, "Rahul Varma");
		lmap.put(8, "Bhumi Sharma");
		lmap.put(null, null);
		lmap.put(null, null);
		lmap.put(1, "Tina");

		for (Entry<Integer, String> entry : lmap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
