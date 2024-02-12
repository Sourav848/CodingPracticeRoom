package com.sourav.linkedlist.problems;

import java.util.ArrayList;
import java.util.List;


public class DeleteNodeWithoutHead {

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
//update del node value from adjacent node value, and delete adjacent node
     public static void deleteNode(Node del) {
        
        Node nextNode = del.next;
        del.data =  nextNode.data;
        del.next = nextNode.next;
    }

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		DeleteNodeWithoutHead list = new DeleteNodeWithoutHead();
		list.head = new Node(85);
		list.head.next = new Node(15); //16
		list.head.next.next = new Node(16);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(25);

		System.out.println("Given Linked list");
		list.printList(head);
		System.out.println("Delete "+head.next.data+" without traversal");
		deleteNode(head.next);
		System.out.println("After Deletion of Node ");
		list.printList(head);
	}

}
