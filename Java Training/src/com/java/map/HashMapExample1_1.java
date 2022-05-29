package com.java.map;

import java.util.HashMap;

public class HashMapExample1_1 {
	public static void main(String[] args) {

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Three");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map2);
		
		System.out.println(map3);
		System.out.println(map3.get(4));
		System.out.println(map3.getOrDefault(4, "Zero"));		
		System.out.println(map3.getOrDefault(3, "Zero"));	
	}
}
