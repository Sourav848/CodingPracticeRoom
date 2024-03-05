package com.sourav.algorithm.tree;

public class TreeMirror {

	
	static class Node
	{
		int data;
		Node left = null, right = null;

		Node(int data) {
			this.data = data;
		}
	}
	
	// Function to convert a binary tree into its mirror tree.
    static void mirror(Node node) {
         
         Node temp = node.left;
         node.left = node.right;
         node.right = temp;
         
         if(node.left != null)
            mirror(node.left);
         if(node.right != null)
            mirror(node.right);

         if(node.left == null && node.right == null)
          return;

        }
	
	
	static void printTree(Node node) {
		if (node == null) {
			return;
		}
		printTree(node.left);
		
		if (node.left == null && node.right == null || node.data != 0) {
			System.out.printf("%d ", node.data);
		}
		
		printTree(node.right);

	}
	
	
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);

		System.out.println("Genral Tree");
		printTree(root);
		System.out.println();
		mirror(root);
		System.out.println("Mirror Tree");
		printTree(root);
		
		
		
		
	/*	   10        |      10
          /  \       |      / \
	     20   30     |     30  20
	    / \          |     / \    
	   40  60        |    60 40

	Output: 30 10 60 20 40  */
} 
	}
