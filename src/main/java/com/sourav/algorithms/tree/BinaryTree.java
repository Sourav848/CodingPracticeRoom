package com.sourav.algorithms.tree;

import java.util.Scanner;

// Java program for different tree traversals
public class BinaryTree {

	/*
	 * Class containing left and right child of current node and key value
	 */
	static class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	static Node createTree() {

		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();

		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left for " + data);
		root.left = createTree();

		System.out.println("Enter right for " + data);
		root.right = createTree();

		return root;
	}
	
	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */

	static void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	static void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	static void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}
	
	static void printTree(Node node) {
		if (node == null) {
			return;
		}
		
		if (node.left == null && node.right == null || node.key != 0) {
			System.out.printf("%d ", node.key);
		}
		printTree(node.left);
		printTree(node.right);

	}

	static Scanner sc = null;

	// Driver method
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		System.out.println("Binary tree is ");
		printTree(root);
		System.out.println();

		System.out.println("Preorder traversal of binary tree is ");
		printPreorder(root);

		System.out.println("\nInorder traversal of binary tree is ");
		printInorder(root);

		System.out.println("\nPostorder traversal of binary tree is ");
		printPostorder(root);
	}

}
