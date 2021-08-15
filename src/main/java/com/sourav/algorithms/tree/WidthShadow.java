package com.sourav.algorithms.tree;

public class WidthShadow {
	
	
	static class Node {
		
		Node left = null, right =  null;
		int data;
		Node(int data) {
			this.data = data;
		}
	}
	
	static void width(Node root, int hl, int[] arr) {
		if (root == null) return;
		
		
		arr[0] = Math.min(arr[0], hl);
		arr[1] = Math.max(arr[1], hl);
		
		width(root.left, hl-1, arr);
		width(root.right, hl+1, arr);
		
	}
	
	static int width(Node root) {
		
		int arr[] = new int[2];
		width(root, 0, arr);
		return arr[1] - arr[0] + 1;
		
	}
	
	
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);
		root.left.right = new Node(60);
		root.right.right = new Node(70);
		
		System.out.println(width(root));
		
	}
	/*                       0
					 	     10
						    /  \
						-1 20   30 1               =  1 - (-2) + 1 = 4
						  / \ 
					 -2	 40  60
						
						Output: 40 60 20 30 10  */
	
}
