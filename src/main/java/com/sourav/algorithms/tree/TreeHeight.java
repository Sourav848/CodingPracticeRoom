package com.sourav.algorithms.tree;


public class TreeHeight {
	
	Node root;
	
	static class Node
	{
		int key;
		Node left = null, right = null;

		Node(int key) {
			this.key = key;
		}
	}
	
	
	static int maxDepth(Node root) { //TC - 0(n)
		
		if (root == null)
			return 0;
		else {
			int lDepth = maxDepth(root.left);
			int rDepth = maxDepth(root.right);

		    return 1 + Math.max(lDepth, rDepth);
		}
	}
	
	public static void main(String[] args)
	{
		TreeHeight tree = new TreeHeight();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.root.left.left.left = new Node(7);

		System.out.println("Height of tree is : " +
									TreeHeight.maxDepth(tree.root));
		
		//The height of the tree is the number of vertices in the tree from the root to the deepest node. 
		// If There are 3 nodes in this path that are connected by 2 edges, so height is 3 .
	}

}
