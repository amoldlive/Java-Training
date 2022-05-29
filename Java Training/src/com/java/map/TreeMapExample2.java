package com.java.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		//tmap.put(null, null);
	
		//sorted using natural sorting order
		tmap.put(105, "Anand Shinde");
		tmap.put(4, "Rohan Roy");
		tmap.put(2, "Rahul Varma");
		tmap.put(8, "Bhumi Sharma");
		

		for (Entry<Integer, String> entry : tmap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
