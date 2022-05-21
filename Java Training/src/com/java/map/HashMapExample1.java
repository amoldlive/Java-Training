package com.java.map;

import java.util.HashMap;

public class HashMapExample1 {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("name", "Rohan Roy");
		map.put("contact_no", "123456789");
		map.put("address", "Nagpur");
		
		System.out.println(map);
		
		System.out.println("Name : " + map.get("name"));
		System.out.println("Contact : " + map.get("contact_no"));
		System.out.println("Address : " + map.get("address"));

		
		//-----------------------------------------------------------------------
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(1, "One");
		map2.put(2, "Two");
		map2.put(3, "Three");

		System.out.println("1st data : " + map2.get(1));
		System.out.println("2nd data : " + map2.get(2));
		System.out.println("3rd data : " + map2.get(3));
		
	}
}
