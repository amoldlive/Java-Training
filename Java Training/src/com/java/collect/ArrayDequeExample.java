package com.java.collect;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {

		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(10);
		queue.offer(9);
		queue.offer(8);
		
		System.out.println("Queue : " + queue);
		System.out.println("Peek : " + queue.peek());
		System.out.println("Polling : " + queue.poll());
		System.out.println("Queue : " + queue);
		
		queue.offerFirst(7);
		queue.offerFirst(6);
		
		
		
		System.out.println("Peek First : " + queue.peekFirst());
		System.out.println("Polling First : " + queue.pollFirst());
		System.out.println("Queue : " + queue);
		
		queue.offerLast(5);
		queue.offerLast(4);
		
		System.out.println("Peek last : " + queue.peekLast());
		System.out.println("Polling Last : " + queue.pollLast());
		System.out.println("Queue : " + queue);
		
	}
}
