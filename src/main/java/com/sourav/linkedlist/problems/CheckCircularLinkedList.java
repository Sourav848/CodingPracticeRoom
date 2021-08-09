package com.sourav.linkedlist.problems;

import java.util.ArrayList;
import java.util.List;


public class CheckCircularLinkedList {

	static Node head;

	// Represent a node of the singly linked list
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static boolean isCircular(Node head) {
	Node temp = head;
	while (temp != null) {
	    
	    if (temp.next == head)
	      return true;
	    temp = temp.next;
	  }
	  
	  return false;
    }

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		CheckCircularLinkedList list = new CheckCircularLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(16);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(25);

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println("");
		System.out.println("Is Linked List is Circular ----> " + isCircular(head));
	}

}
