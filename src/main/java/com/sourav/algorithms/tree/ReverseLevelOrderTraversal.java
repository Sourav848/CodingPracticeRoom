package com.sourav.algorithms.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

// A class to store a binary tree node


class ReverseLevelOrderTraversal
{
	
	static class Node
	{
		int data;
		Node left = null, right = null;

		Node(int data) {
			this.data = data;
		}
	}
		
	
	public static ArrayList<Integer> reverseLevelOrder(Node root) {
		Deque<Node> dq = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		Node node;
		dq.add(root);
		while (!dq.isEmpty()) {
			node = dq.poll();
			list.add(node.data);
			if (node.right != null)
				dq.add(node.right);
			if (node.left != null)
				dq.add(node.left);
		}
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);
		//root.right.left = new Node(16);
		//root.right.right = new Node(25);

		ArrayList<Integer> list = reverseLevelOrder(root);
		
		for (Integer al : list) {
			System.out.print(al+ " ");
		}
		
		
	/*	   10
          /  \
	     20   30
	    / \ 
	   40  60

	Output: 40 60 20 30 10  */
		
		
	}
}