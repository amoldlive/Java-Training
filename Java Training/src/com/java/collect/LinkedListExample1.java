package com.java.collect;

import java.util.LinkedList;

public class LinkedListExample1 {
	public static void main(String[] args) {
			
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(11);
		linkedList.add(12);
		linkedList.add(13);
		linkedList.add(14);
		linkedList.add(4);
		linkedList.add(7);
		linkedList.add(14);
		
		System.out.println(linkedList);
		
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+"\t");
		}
		
		//iterator / listIterator == assignment
	}
}
