package com.offer.list;

public class ReverseDLL {
	public Node reverse(Node head){
		if(head == null || head.right == null) return head;
		Node first = head, second = first.right;
		while(true){
			first.right = first.left;
			first.left = second;
			if(second != null){
				first = second;
				second = second.right;
			} else
				break;
		}
		return first;
	}
}	
