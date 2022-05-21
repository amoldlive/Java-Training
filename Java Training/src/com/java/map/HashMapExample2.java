package com.java.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample2 {
	public static void main(String[] args) {
			
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Rohan Roy");
		map.put(2, "Shreya Gupta");
		map.put(3,"Rahul Varma");
		
		for(Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
					if(entry.getKey()==2) {
						System.out.println("Welcome "+entry.getValue());
					}
		}
		
	}
}
