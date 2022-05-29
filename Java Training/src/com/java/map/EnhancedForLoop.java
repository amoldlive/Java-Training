package com.java.map;

import java.util.ArrayList;

public class EnhancedForLoop {
	public static void main(String[] args) {
			
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Jaipur");
		list.add("Kolkata");
		list.add("Raipur");
		
		//normal for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		
		System.out.println("\n*************************");
		
		//enhanced for loop
		for(String city:list) {
			System.out.print(city+"\t");
		}
		
	}
}
