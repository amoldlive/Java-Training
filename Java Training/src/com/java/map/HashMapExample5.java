package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample5 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rohan Roy");
		map.put(1, "Tina Sharma");
		map.put(1, "Mohamad Ali");
		map.put(2, "Shreya Gupta");
		map.put(3, "Rahul Varma");
		map.put(3, "Rahul Varma");
		map.put(3, "Rahul Varma");

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
