package com.java.collect;

import java.util.Iterator;
import java.util.Stack;

public class StackExample1 {
	public static void main(String[] args) {
		
		
		Stack<Integer> numberStack=new Stack<Integer>();
		numberStack.push(10);
		numberStack.push(20);
		numberStack.push(30);
		numberStack.push(40);
		numberStack.push(50);
		numberStack.push(60);
		
		System.out.println("Stack : "+numberStack);
		System.out.println("Top Element : "+numberStack.peek());
		
		System.out.println("Remove Top Element : "+numberStack.pop());
		
		System.out.println("Top Element : "+numberStack.peek());
		System.out.println("Stack : "+numberStack);
		
		numberStack.pop();
		numberStack.pop();
		System.out.println("Stack : "+numberStack);
		System.out.println("Stack : "+numberStack.peek());
		
		
		Iterator<Integer> stackIterator= numberStack.iterator();
		while(stackIterator.hasNext()) {
			System.out.print(stackIterator.next()+"\t");
		}
		
		
	}
}
