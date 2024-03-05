package com.sourav.linkedlist.problems;

public class LinkedListAddition {

	static Node head1, head2;

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
			carry = sum / 10;// a<b, a/b = 0
			curr.next = new Node(sum % 10); //a<b, a%b=a
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new Node(carry);
		}
		return dummyHead.next;

	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListAddition list = new LinkedListAddition();
		
		// creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        //list.head1.next.next.next = new Node(4);
        //list.head1.next.next.next.next = new Node(6);
        
 
        // creating seconnd list
        list.head2 = new Node(7);
        list.head2.next = new Node(5); // ans = 411
       
 

		System.out.println("Given first Linked list");
		printList(head1);
		System.out.println("");
		System.out.println("Given second Linked list");
		printList(head2);
		System.out.println("");
		Node head3 = addTwoNumbers(list.head1, list.head2);
		System.out.println("sum of two Linked list is ");
		printList(head3);
	}
}
