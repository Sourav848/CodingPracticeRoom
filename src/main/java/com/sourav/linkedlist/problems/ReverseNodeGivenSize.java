package com.sourav.linkedlist.problems;

import java.util.ArrayList;

import com.sourav.linkedlist.problems.ReverseLinkedList.Node;

public class ReverseNodeGivenSize {
	
	
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

    public static Node reverse(Node node, int k) {
        //Your code here
        Node temp = node;
        ArrayList <Integer > al = new ArrayList<> ();
        while (temp != null) {
            al.add(temp.data);
            temp = temp.next;
        }

        Integer arr[] = al.toArray(new Integer[al.size()]);
        arr = rotateArrayInGroup(arr, k);

        temp = node;
        int i = 0;
        while (temp != null) {
            temp.data = arr[i];
            temp = temp.next;
            i++;
        }

        return node;
    }

    public static Integer[] rotateArrayInGroup(Integer arr[], int groupSize) {

        for (int i = 0; i < arr.length; i += groupSize) {

            int left = i;
            int right = Math.min(left + groupSize - 1, arr.length - 1);

            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }
    
 // prints content of double linked list
 	void printList(Node node)
 	{
 		while (node != null) {
 			System.out.print(node.data + " ");
 			node = node.next;
 		}
 	}
    
    public static void main(String[] args)
	{
    	ReverseNodeGivenSize list = new ReverseNodeGivenSize();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = reverse(head , 2);
		System.out.println("");
		System.out.println("Reversed linked list in K size ");
		list.printList(head);
	}
}
