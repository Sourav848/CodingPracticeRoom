package com.sourav.algorithms.tree;

public class HeightBalance {

	Node root;

	static class Node {
		int key;
		Node left = null, right = null;

		Node(int key) {
			this.key = key;
		}
	}

	static int height(Node root) {
		if (root == null)
			return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	static boolean isBalanced(Node root) {
		if (root == null)
			return true;
		int left = height(root.left);
		int right = height(root.right);
		return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
	}

	public static void main(String[] args) {
		HeightBalance tree = new HeightBalance();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		// tree.root.left.left.left = new Node(7);

		System.out.println("Is Height of tree is balance : " + isBalanced(tree.root));

		//The max difference in height of left subtree and right subtree is 1 so Hence balanced. 
	}

}
