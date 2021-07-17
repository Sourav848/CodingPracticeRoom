package com.sourav.linkedlist.problems;

public class LinkedListAddition {

	static Node head = null;

	// Represent a node of the singly linked list
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node addTwoNumbers(Node l1, Node l2) {

		Node dummyHead = new Node(0);
		Node p = l1, q = l2;
		Node curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.data : 0;
			int y = (q != null) ? q.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return curr.next;

	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListAddition list1 = new LinkedListAddition();
		head = new Node(2);
		head.next = new Node(5);
		head.next.next = new Node(5);
		// list1.head.next.next.next = new Node(20);
		// list1.head.next.next.next.next = new Node(20);

		LinkedListAddition list2 = new LinkedListAddition();
		head = new Node(2);
		head.next = new Node(5);
		head.next.next = new Node(5);
		// list2.head.next.next.next = new Node(20);
		// list2.head.next.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		printList(head);
		head = addTwoNumbers(list1.head, list2.head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		printList(head);
	}
}
