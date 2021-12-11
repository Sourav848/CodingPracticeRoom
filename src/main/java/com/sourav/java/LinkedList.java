package com.sourav.java.examples;

import java.io.*;

//Java program to implement
//a Singly Linked List
public class LinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public static LinkedList insert_at_first(LinkedList list, int data)
	{
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert_at_last the new_node there
			new_node.next = list.head;
			list.head = new_node;			
		}

		// Return the list by head
		return list;
	}

	// Method to insert_at_last a new node
	public static LinkedList insert_at_last(LinkedList list, int data)
	{
		// Create a new node with given data
		Node new_node = new Node(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert_at_last the new_node there
			Node last  = list.head;
			while (last .next != null) {
				last  = last .next;
			}
			
			// Insert the new_node at last node
             last.next = new_node;
		}

		// Return the list by head
		return list;
	}
	
	public static LinkedList insert_at_pos(LinkedList list, int data, int pos)
	{
		// Create a new node with given data
		Node new_node = new Node(data);//temp1
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			// Else traverse till the last node
			// and insert_at_last the new_node there
			Node last  = list.head; //temp2
			
             for(int i=1; i<=pos-2;i++) {
            	 last  = last .next;
             }
			// Insert the new_node at last node
             new_node.next = last .next;
             last.next = new_node;
		}

		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
	
		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");
	
			// Go to next node
			currNode = currNode.next;
		}
	}
	
	// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert_at_last(list, 1);
		list = insert_at_last(list, 2);
		list = insert_at_last(list, 3);
		list = insert_at_last(list, 4);
		list = insert_at_last(list, 5);
		list = insert_at_last(list, 6);
		list = insert_at_last(list, 7);
		list = insert_at_last(list, 8);
		list = insert_at_pos(list, 9, 2);
		list = insert_at_first(list, 10);

		// Print the LinkedList
		printList(list);
	}
}
