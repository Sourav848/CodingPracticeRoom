package com.sourav.algorithm.stack.queue;

import java.util.Stack;
	

//Java program to implement QueueUsingStack using

// Method 1 (By making enQueue operation costly) This method makes sure that oldest entered element is always 
//at the top of stack 1, so that deQueue operation just pops from stack1. 
//To put the element at top of stack1, stack2 is used.
class QueueUsingStack {
		 
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();

		 void enQueue(int x) {
			// Move all elements from s1 to s2
			 // at first s2 = s1; (s2 = 1,2,3)
			 // then s1 = s2; (s1 = 3,2,1) // insertion happend from front and deletion rear in queue
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}

			// Push item into s1
			s1.push(x);

			// Push everything back to s1
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}

		// Dequeue an item from the queue
		 int deQueue() {
			// if first stack is empty
			if (s1.isEmpty()) {
				System.out.println("Q is Empty");
				System.exit(0);
			}

			// Return top of s1
			int x = s1.peek(); //last or top element will be return
			s1.pop();
			return x;
		}


//Driver code
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}

