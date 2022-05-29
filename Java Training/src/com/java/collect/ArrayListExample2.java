package com.java.collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		List<String> cityNamesList=new ArrayList<String>();
		cityNamesList.add("Nagpur");
		cityNamesList.add("Mumbai");
		cityNamesList.add("Pune");
		cityNamesList.add("Hyd");
		cityNamesList.add("Jaipur");
		
		System.out.println(cityNamesList);
		System.out.println("Size : "+cityNamesList.size());
		
		cityNamesList.remove(1);

		System.out.println(cityNamesList);

		cityNamesList.remove("Pune");
		
		System.out.println(cityNamesList);
		
		boolean isContainsNagpur=cityNamesList.contains("Nagpur");
		System.out.println("isContainsNagpur : "+isContainsNagpur);
		
		boolean isContainsPune=cityNamesList.contains("Pune");
		System.out.println("isContainsPune : "+isContainsPune);
		
		
		System.out.println("Size : "+cityNamesList.size());
		
		Object[] arr=cityNamesList.toArray();
		
		System.out.println("isEmpty : "+cityNamesList.isEmpty());
		
		System.out.println("Hashcode : "+cityNamesList.hashCode());
		
		
		List<String> cityNamesList2=cityNamesList;
		System.out.println("Equals : "+cityNamesList2.equals(cityNamesList));
		
		List<String> cityNamesList3=new ArrayList<String>();
		cityNamesList3.add("Raipur");
		System.out.println("Equals : "+cityNamesList3.equals(cityNamesList));
		System.out.println("Equals : "+cityNamesList3.equals(cityNamesList2));
		
		cityNamesList.clear();
		System.out.println(cityNamesList);

	}
}
