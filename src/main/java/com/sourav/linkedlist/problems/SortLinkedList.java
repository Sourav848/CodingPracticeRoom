package com.sourav.linkedlist.problems;

import java.util.Arrays;

class SortLinkedList {
	
	static Node head;
	
	static class Node {
		
		Node next;
		int data;
		
		Node(int data) {
	     this.data = data;
	     this.next = null;
		}
	}
	
	
    public static Node sortList(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int arr[] = new int[count];
        temp = head;
        count = 0;
        while(temp!=null){
            arr[count++] = temp.data;
            temp=temp.next;
        } 
        Arrays.sort(arr);
        temp = head;
        count=0;
        while(temp!=null){
            temp.data = arr[count++];
            temp = temp.next;
        }
        return head;
    }
    
    static void printNode(Node node) {
    	
    	while (node != null) {
    		System.out.print(node.data+ " ");
    		node = node.next;
    		
    	}
    }
    
    public static void main(String[] args) {
    	    	
    	SortLinkedList sortLinkedList = new SortLinkedList();
    	sortLinkedList.head = new Node(85);
    	sortLinkedList.head.next = new Node(15);
    	sortLinkedList.head.next.next = new Node(20);
    	sortLinkedList.head.next.next.next = new Node(4);
    	sortLinkedList.head.next.next.next.next = new Node(19);
		
		
	    printNode(sortList(head));
	  
		
    	
    }
}
