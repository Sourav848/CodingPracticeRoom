package com.sourav.algorithms.tree;

import java.util.ArrayList;

public class RightViewBinaryTree {
	Node root;

	public static ArrayList<Integer> rightView(Node root) {
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

		if (root.right != null) {
			depthFirstSearch(root.right, count + 1, output);
		}

		if (root.left != null) {
			depthFirstSearch(root.left, count + 1, output);
		}

	}

	public static void main(String[] args) {
		TreeHeight tree = new TreeHeight();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Left view of Binary tree is : " + rightView(tree.root));

	}

}
