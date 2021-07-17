package com.sourav.algorithms.tree;


public class TreeDiameter {
	
	Node root;
	
	
	static class Node
	{
		int key;
		Node left = null, right = null;

		Node(int key) {
			this.key = key;
		}
	}
	
	static int max;
	 
	 
	    public static int getDiameter(Node root)
	    {
	        int h= 0;
	        
	        if(root == null)//base case 
	           return 0;
	        
	        int l= getDiameter(root.left);//recursing down and calculating the Height 
	        int r= getDiameter(root.right);
	        
	        h= Math.max(l,r);//maximum height 
	        
	        max= Math.max(max,l+r+1);//updating the maximum diameter 
	        
	        h=h+1;//increasing height covering every node 
	        return h; //returning the maximum height 
	    }
	    static int diameter(Node root) {
	       max= Integer.MIN_VALUE;//identity 
	        getDiameter(root);
	        return max; //node=edge+1, i.e; edge=node-1
	    }
	
	    
	    public static void main(String[] args)
		{
	
	    TreeDiameter tree = new TreeDiameter();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.root.left.left.left = new Node(7);
		
		
	/*	logic is simple diameter of a binary tree is nothing but the maximum of 
		left subtree height + right subtree height + 1 for all the nodes that are present in the binary tree */

		System.out.println("Height of tree is : " + diameter(tree.root));
	
		}
}
