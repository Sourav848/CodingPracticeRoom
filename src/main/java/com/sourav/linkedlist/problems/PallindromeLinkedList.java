package com.sourav.linkedlist.problems;

public class PallindromeLinkedList {

	static class Node {

		int data;
		Node next;

		Node(int data) {

			this.data = data;
		}
	}

	static boolean isPalindrome(Node head) {
		String str = "";

		if (head == null)
			return false;

		Node temp = head;
		while (temp != null) {
			str = str + String.valueOf(temp.data);
			temp = temp.next;
		}

		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString()))
			return true;
		return false;
	}

	public static void main(String[] args) {

		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(2);
		n1.next.next.next = new Node(1);
		
		System.out.println(isPalindrome(n1));

	}

}
