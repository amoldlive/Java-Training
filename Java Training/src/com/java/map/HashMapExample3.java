package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample3 {
	public static void main(String[] args) {
			
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Rohan Roy");
		map.put(2, "Shreya Gupta");
		map.put(3,"Rahul Varma");
		
		Set<Entry<Integer, String>> entrySet=map.entrySet();
		
		Iterator itr=entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=(Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	
		
	}
}
