package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample4 {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Rohan Roy");
		map.put(2, "Shreya Gupta");
		map.put(3, "Rahul Varma");

		Set<Integer> keySet = map.keySet();

		Iterator itr = keySet.iterator();

		while (itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println(key + "  " + map.get(key));
		}

	}
}
