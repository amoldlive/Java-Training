package com.java.collect;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
		queue.offer(10);
		queue.offer(2);
		queue.offer(3);
		queue.offer(66);
		queue.offer(44);
		queue.offer(88);
		queue.offer(1);
		
		//display in random order
		System.out.println("Queue : "+queue);
		
		System.out.println("peek : "+queue.peek());
		System.out.println("poll : "+queue.poll());
		System.out.println("Queue : "+queue);
		
		System.out.println("peek : "+queue.peek());
		System.out.println("poll : "+queue.poll());
		System.out.println("Queue : "+queue);
		
		System.out.println("peek : "+queue.peek());
		System.out.println("poll : "+queue.poll());
		System.out.println("Queue : "+queue);
	}
}
