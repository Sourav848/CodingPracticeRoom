package com.sourav.linkedlist.problems;

import java.util.ArrayList;
import java.util.List;

//companies : optum


public class MiddleElementLinkedList {

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

	static int getMiddle(Node head) {
		List<Integer> list = new ArrayList<Integer>();
		Node temp = head;
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		}
		return list.get((list.size() / 2));
	}
	
	/*Method 2: Traverse linked list using two pointers. Move one pointer by one and the other pointers by two. 
	When the second pointer reaches the end slow pointer will reach the middle of the linked list*/

	
	static int getMiddleByTwoPointer(Node head) {
		Node ptr2 = head;
		Node ptr1 = head;
		while (ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		return ptr1.data;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		MiddleElementLinkedList list = new MiddleElementLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(16);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(25);

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println("");
		System.out.println("Middle Element of linked list ----> " + getMiddle(head));
		System.out.println("Second approach By two Pointer ----> "+ getMiddleByTwoPointer(head));
	
	}
	
	
	
	
}
