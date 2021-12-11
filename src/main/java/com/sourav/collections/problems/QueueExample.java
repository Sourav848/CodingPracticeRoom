package com.sourav.collections.problems;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String args[])
	{
		Queue<Integer> pq = new PriorityQueue<>();

		pq.add(444);
		pq.add(34);
		pq.add(9);
		pq.add(23);
		

		System.out.println("Initial Queue " + pq);
		
		// Printing the top element of PriorityQueue
        System.out.println(pq.peek());

		pq.remove(9);

		System.out.println("After Remove " + pq);

		System.out.println("Poll Method " + pq.poll());

		System.out.println("Final Queue " + pq);
		
		//Implementing ArrayDeque
		Queue<Integer> adq = new ArrayDeque<>();
		
		adq.add(10);
		adq.add(50);
		adq.add(9);
		adq.add(23);
		
		System.out.println("ArrayDeque After Remove " + adq);
		
		System.out.println("ArrayDeque Poll Method " + adq.poll());
		
	
	}
}
