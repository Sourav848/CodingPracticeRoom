package com.sourav.algorithm.binary.search.tree;

import java.util.ArrayList;

public class BinarySearchTreeorNot {

	// Root of BST
	Node root;
	
	static class Node
	{
		int data;
		Node left, right = null;

		 Node(int item)
		{
			data = item;
		}
	}

	
    //Function to check whether a Binary Tree is BST or not.
    ArrayList<Integer> al = new ArrayList<>();
    void inorder(Node root){
        
        if(root!=null)
        {
            inorder(root.left);
            al.add(root.data);
            inorder(root.right);
        }
    }
    
    
    boolean isBST(Node root)
        {
           inorder(root); //if tree would be BST then list will be in ascending order.
           
           for(int i=0;i<al.size()-1;i++)
           {
               if(al.get(i+1)<=al.get(i)) return false;
           }
           
           return true;
           
        }
    
    public static void main(String[] args) {
    	BinarySearchTreeorNot tree = new BinarySearchTreeorNot();

		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		// tree.root.left.left.left = new Node(7);

		//BST of 1, 2, 3, 4, 5 is      4
		//                           2   5
		//                        1    3
		
		if (tree.isBST(tree.root)) 
			System.out.println("This is BST");
	    else 
	    	System.out.println("This is not a BST");

	}
}