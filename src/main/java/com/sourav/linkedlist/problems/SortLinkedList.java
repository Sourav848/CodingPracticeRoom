package com.sourav.linkedlist.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
       List<Integer> list = new ArrayList<>();
        while(temp!=null) {
           list.add(temp.data);
            temp=temp.next;
        } 
        Collections.sort(list);
        temp = head;
        count=0;
        while(temp!=null){
            temp.data = list.get(count++);
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
    	sortLinkedList.head.next.next.next = new Node(1);
    	sortLinkedList.head.next.next.next.next = new Node(19);
		
		
	    printNode(sortList(head));
	  
		
    	
    }
}
