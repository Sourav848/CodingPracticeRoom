package com.sourav.algorithm.stack.queue;

import java.util.Scanner;
import java.util.Stack;

class QueueUsingStack {
	
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
    
    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to push into the queue: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            obj.push(in);
        }
        
        System.out.println("Pop element: " + obj.pop());
        System.out.println("Peek element: " + obj.peek());
        System.out.println("Is queue empty? " + obj.empty());
    }   
}
