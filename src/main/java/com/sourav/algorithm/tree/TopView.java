package com.sourav.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopView {

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

	static List<Integer> topView(Node root) {
		LinkedList<vPair> ll = new LinkedList<>();

		Map<Integer, List<Integer>> map = new LinkedHashMap<>();

		List<Integer> ans = new ArrayList<>();

		int minhl = 0;
		int maxhl = 0;

		ll.addLast(new vPair(root, 0));

		while (ll.size() != 0) {
			int size = ll.size();
			while (size-- > 0) {

				vPair rp = ll.removeFirst();

				maxhl = Math.max(maxhl, rp.hl);
				minhl = Math.min(minhl, rp.hl);

				map.putIfAbsent(rp.hl, new ArrayList<>());
				map.get(rp.hl).add(rp.node.data);

				if (rp.node.left != null)
					ll.addLast(new vPair(rp.node.left, rp.hl - 1));
				if (rp.node.right != null)
					ll.addLast(new vPair(rp.node.right, rp.hl + 1));
			}

		}

		for (int i = minhl; i <= maxhl; i++) {
			List<Integer> lisy = map.get(i);
			for (Integer I : lisy) {
				ans.add(I);
				break;
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
	/*                    HL= 0 = (10, 60)
					 	     10
						    /  \
				-1 = (20) 20   30 1 = (30)
						  / \ 
		    -2 = (40)	 40  60     
						
						Output: [40, 20, 10, 30]  */

}
