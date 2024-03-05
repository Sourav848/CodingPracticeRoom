package com.sourav.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.sourav.algorithm.tree.WidthShadow.Node;


public class BottomView {

	static class Node {

		int data;
		Node left = null, right = null;

		Node(int data) {
			this.data = data;
		}
	}

	static class vPair {

		int hl;
		Node node;

		vPair(Node node, int hl) {
			this.node = node;
			this.hl = hl;
		}
	}
	
	
	static void width(Node root, int hl, int[] arr) {
		if (root == null) return;
		
		
		arr[0] = Math.min(arr[0], hl);
		arr[1] = Math.max(arr[1], hl);
		
		width(root.left, hl-1, arr);
		width(root.right, hl+1, arr);
		
	}

	static List<Integer> topView(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		int[] arr = new int[2];
		width(root,  0,  arr);
		
		int len = arr[1] - arr[0] + 1;
		for (int i=0; i<len; i++) ans.add(0);
		
		LinkedList<vPair> ll = new LinkedList<>();
		ll.addLast(new vPair(root, Math.abs(arr[0]))); // Adding +2 

		while (ll.size() != 0) {
			int size = ll.size();
			while (size-- > 0) {

				vPair rp = ll.removeFirst();

				Node node = rp.node;
				int hl = rp.hl;
				
				ans.set(hl, node.data);

				if (rp.node.left != null)
					ll.addLast(new vPair(rp.node.left, rp.hl - 1));
				if (rp.node.right != null)
					ll.addLast(new vPair(rp.node.right, rp.hl + 1));
			}

		}

		return ans;
	}

	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);
		
		System.out.println(topView(root)+ " ");
		
	}
	/*                    HL= 2 = (10, 60)
					 	     10
						    /  \
				1 = (20) 20   30 3 = (30)
						  / \ 
		    0 = (40)	 40  60 = 2     
						
						Output: [40, 20, 60, 30]   */

}
