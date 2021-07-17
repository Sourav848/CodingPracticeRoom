package com.sourav.linkedlist.problems;


public class DeleteDuplicates {
	
	//Represent a node of the singly linked list  
	static class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    
    static Node head = null;
    
     static Node removeDuplicates(Node head)    {
        if(head==null || head.next==null) return head;
       Node root = head;
       while(head.next!=null){
          if(head.data!=head.next.data){
              head = head.next;
          }else{
              head.next = head.next.next;
          }
       }
       return root;
       }
    
     void printList(Node node)
 	{
 		while (node != null) {
 			System.out.print(node.data + " ");
 			node = node.next;
 		}
 	}
     
    public static void main(String[] args)
	{
    	DeleteDuplicates list = new DeleteDuplicates();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = removeDuplicates(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

}
