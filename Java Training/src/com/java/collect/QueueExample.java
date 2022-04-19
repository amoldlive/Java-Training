package com.java.collect;

import java.util.LinkedList;

public class QueueExample {
	public static void main(String[] args) {
			
		LinkedList<String> queue=new LinkedList<String>();
		queue.add("P3");
		queue.add("P1");
		queue.add("P5");
		
		queue.offer("p2");
		queue.offer("p4");
		queue.offer("p6");
		System.out.println("Queue : "+queue);
		
		System.out.println("Peek : "+queue.peek());
		System.out.println("Pooling : "+queue.poll());
		System.out.println("Queue : "+queue);
		
		System.out.println("Peek : "+queue.peek());
		System.out.println("Pooling : "+queue.poll());
		System.out.println("Queue : "+queue);
		
		
		System.out.println("Peek : "+queue.peek());
		System.out.println("Pooling : "+queue.poll());
		System.out.println("Queue : "+queue);
	}
}
