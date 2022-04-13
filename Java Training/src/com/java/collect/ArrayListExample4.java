package com.java.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample4 {
	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(11);
		arrList.add(12);
		arrList.add(13);
		arrList.add(14);
		arrList.add(15);
		arrList.add(5);
		arrList.add(15);
		
		System.out.println(arrList);
		
		arrList.remove(1);
		
		System.out.println(arrList);
		
	}
}
