package com.java.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample3 {
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

		// for loop
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + "\t");
		}

		System.out.println("\n*************************");

		// arrList.clear();

		// iterator
		Iterator<Integer> arrlistIterator = arrList.iterator();

		System.out.println(arrlistIterator.hasNext());
		
		while (arrlistIterator.hasNext()) {
			System.out.print(arrlistIterator.next()+"\t");
		}
		
		System.out.println("\n*************************");
		//list iterator
		ListIterator<Integer> listIterator=arrList.listIterator();
		System.out.println(listIterator.hasNext());
		
		System.out.println("index : "+listIterator.nextIndex());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
	
		System.out.println("backword index : "+listIterator.previousIndex());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		
		
	}
}
