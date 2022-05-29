package com.java.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(6);
		list.add(9);
		list.add(1);
		System.out.println("list : " + list);

		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		
		// System.out.println("Hashset : "+set);
		set.add(40);
		System.out.println("Hashset : " + set);

		// for loop
		// iterator
		Iterator<Integer> setiterator = set.iterator();
		while(setiterator.hasNext()) {
			System.out.print(setiterator.next()+"\t");
		}
		
		System.out.println();
		
		LinkedHashSet<Integer> linkedHS=new LinkedHashSet<Integer>();
		linkedHS.addAll(list);
		linkedHS.add(50);
		System.out.println("LinkedHashSet : "+linkedHS);
		
		
		TreeSet<Integer> tSet=new TreeSet<Integer>();
		tSet.addAll(list);
		tSet.add(4);
		tSet.add(60);
		
		System.out.println("ASC Treeset : "+tSet);
		System.out.println("DESC Treeset : "+tSet.descendingSet());
		
		System.out.println("HeadSet : "+tSet.headSet(5));
		System.out.println("TailSet : "+tSet.tailSet(5));
		System.out.println("subSet : "+tSet.subSet(3, 9));
		
		
	}
}
