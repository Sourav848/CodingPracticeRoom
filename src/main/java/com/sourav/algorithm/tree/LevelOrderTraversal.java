package com.sourav.algorithm.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

	/* Class to print Level Order Traversal or BFS */ 
	class LevelOrderTraversal {

		static Node root;
		
		/* Class to represent Tree node */
	static class Node {
			int data;
			Node left, right;

			public Node(int item) {
				data = item;
				left = null;
				right = null;
			}
		}

		/* Given a binary tree. Print
		its nodes in level order
		using array for implementing queue */
	     static ArrayList<Integer> levelOrder(Node root)
		{
			Queue<Node> queue = new ArrayDeque<Node>();
			ArrayList<Integer> list = new ArrayList<>();
			queue.add(root);
			while (!queue.isEmpty())
			{

				Node tempNode = queue.poll();
				//System.out.print(tempNode.data + " ");
				list.add(tempNode.data);

				/*Enqueue left child */
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}

				/*Enqueue right child */
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
			
			return list;
		}

		public static void main(String args[])
		{
			/* creating a binary tree and entering
			the nodes */
			LevelOrderTraversal tree_level = new LevelOrderTraversal();
			tree_level.root = new Node(1);
			tree_level.root.left = new Node(2);
			tree_level.root.right = new Node(3);
			tree_level.root.left.left = new Node(4);
			tree_level.root.left.right = new Node(5);
			
			ArrayList<Integer> list = levelOrder(root);
			
			for (Integer al : list) {
				System.out.print(al+ " ");
			
		}
			
			
		/*	Input:
		        10
		     /      \
		    20       30
		  /   \
		 40   60
		Output:10 20 30 40 60 */
	}
		
	}

	
	
	

