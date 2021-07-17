package com.sourav.algorithms.tree;

import java.util.ArrayList;

public class LeftViewBinaryTree {

	Node root;

	static class Node {
		int data;
		Node left = null, right = null;

		Node(int key) {
			this.data = key;
		}
	}

	public static ArrayList<Integer> leftView(Node root) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		depthFirstSearch(root, 0, output);
		return output;
	}

	private static void depthFirstSearch(Node root, int count, ArrayList<Integer> output) {
		if (root == null) {
			return;
		}
		if (count >= output.size()) {
			output.add(root.data);
		}

		if (root.left != null) {
			depthFirstSearch(root.left, count + 1, output);
		}

		if (root.right != null) {
			depthFirstSearch(root.right, count + 1, output);
		}
	}

	public static void main(String[] args) {
		LeftViewBinaryTree tree = new LeftViewBinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Left view of Binary tree is : " + leftView(tree.root));

	}

}
