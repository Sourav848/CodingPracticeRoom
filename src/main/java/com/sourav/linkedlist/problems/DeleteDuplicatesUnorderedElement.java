package com.sourav.linkedlist.problems;

import java.util.HashSet;

public class DeleteDuplicatesUnorderedElement {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static public Node removeDuplicates(Node head) {
		
		HashSet<Integer> hs = new HashSet<>();
		/* Pick elements one by one */
		Node current = head;
		Node prev = null;
		while (current != null) {
			int curval = current.data;
			if (hs.contains(curval)) { //checking for duplicates
				prev.next = current.next; //deletion of node in case of same. changing here will effect in head node also
			} else {
				hs.add(curval);
				prev = current; //maintaining previous node for deletion
			}
			current = current.next;
		}
		return head;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		DeleteDuplicatesUnorderedElement nodes = new DeleteDuplicatesUnorderedElement();
		nodes.head = new Node(85);
		nodes.head.next = new Node(15);
		nodes.head.next.next = new Node(20);
		nodes.head.next.next.next = new Node(4);
		nodes.head.next.next.next.next = new Node(15);

		removeDuplicates(head);

		System.out.println("linked list ");
		nodes.printList(head);
	}
}
