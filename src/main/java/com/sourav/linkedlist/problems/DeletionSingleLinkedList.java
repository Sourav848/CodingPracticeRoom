package com.sourav.linkedlist.problems;



public class DeletionSingleLinkedList {  
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    }  
  
    //deleteFromStart() will delete a node from the beginning of the list  
    public void delete_at_first() {  
  
        //Checks if the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one node  
            //If not, the head will point to next node in the list and tail will point to the new head.  
            if(head != tail) {  
                head = head.next;  
            }  
            //If the list contains only one node  
            //then, it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }   
    
    public void deleteNode_atLast()
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the data to be deleted
        if (temp != null && temp.next == null) {
           head = null; // Changed head to null
            return;
        }
 
        // Search for the data to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.next != null) {
        	prev = temp;
            temp = temp.next;
        }
 
        // If data was not present in linked list
        if (temp == null)
            return;
 
        // delete last node from linked list
        prev.next = null;
    }
    
    
    void deleteNode_at_pos(int position)
    {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list
    }
    
    
    public void deleteByNode(int data)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the data to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the data to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
 
        // If data was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        DeletionSingleLinkedList sList = new DeletionSingleLinkedList();  
  
        //Adds data to the list  
        sList.addNode(4);
        sList.addNode(6);
        sList.addNode(1); 
        sList.addNode(7); 
        sList.addNode(2);
        sList.addNode(5); 
        sList.addNode(3);  
       
  
        //Printing original list  
        System.out.println("Original List: ");  
        sList.display(); 
        
        
      //Printing updated list  
        sList.delete_at_first();  
        System.out.println("Updated List: ");  
        sList.display();  
        
          
      //Printing updated list  
        sList.deleteNode_at_pos(4);
        System.out.println("Updated List: ");  
        sList.display();  
        
        
      //Printing updated list  
        sList.deleteNode_atLast();  
        System.out.println("Updated List: ");  
        sList.display();  
        
      //Printing updated list  
        sList.deleteByNode(1);
        System.out.println("Updated List: ");  
        sList.display();  
  
        
    }  
} 