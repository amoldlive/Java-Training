package com.java.collect;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

			Vector<Integer> vectorData=new Vector<Integer>();
			
			vectorData.addElement(10);
			vectorData.addElement(20);
			vectorData.addElement(30);
			
			vectorData.add(40);
			vectorData.add(50);
			vectorData.add(60);
		
			System.out.println("Vector : "+vectorData);
			
			vectorData.removeElement(40);
			System.out.println("Vector : "+vectorData);
			
			vectorData.remove(3);
			System.out.println("Vector : "+vectorData);
			
			Enumeration<Integer> vectorDataList=vectorData.elements();
			while(vectorDataList.hasMoreElements()) {
				System.out.print(vectorDataList.nextElement()+"\t");
			}
			
	}
}
