package com.cc150.list;

public class FindFirstNodeInLoopList_2_6 {
	public Node find(Node head){
		if(head == null || head.right == null) return null;
		Node first = null, second = null;
		do{
			if(first == null){
				first = head.right;
				second = head;
			} else {
				first = first.right.right;
				second = second.right;
			}
			
		} while(first != second);
		Node third = null;
		while(first != third){
			first = first.right;
			if(third == null)
				third = head;
			else
				third = third.right;
		}
		return first;
	}
}
