package com.sourav.linkedlist.problems;

//Java program to detect and remove loop in a linked list
import java.util.*;

public class DetectandRemove {

	static Node head; // head of list

	/* Linked list Node*/
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	static public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Function to print the linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Returns true if the loop is removed from the linked
	// list else returns false.
	static boolean removeLoop(Node h)
	{
		HashSet<Node> s = new HashSet<Node>();
		Node prev = null;
		while (h != null) {
			// If we have already has this node
			// in hashmap it means their is a cycle and we
			// need to remove this cycle so set the next of
			// the previous pointer with null.

			if (s.contains(h)) { // remind that we are checking node address not value
				prev.next = null;
				return true;
			}

			// If we are seeing the node for
			// the first time, insert it in hash
			else {
				s.add(h);
				prev = h;
				h = h.next;
			}
		}

		return false;
	}

	/* Driver program to test above function */
	public static void main(String[] args)
	{
		DetectandRemove llist = new DetectandRemove();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		if (removeLoop(head)) {
			System.out.println("Linked List after removing loop");
			llist.printList(head);
		}
		else
			System.out.println("No Loop found");
	}
}

//This code is contributed by Animesh Nag.
