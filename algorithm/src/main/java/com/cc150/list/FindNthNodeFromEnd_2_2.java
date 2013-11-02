package com.cc150.list;

public class FindNthNodeFromEnd_2_2 {
	public Node find(Node head, int n){
		if(head == null)
			return null;
		Node first = null, second = null; 
		int step = 0;
		do{
			if(first == null)
				first = head;
			else
				first = first.right;
			step++;
		}while(step < n && first != null);
		if(first == null)
			return null;
		while(first != null){
			if(second == null)
				second = head;
			else second = second.right;
			first = first.right;
		}
		return second;
	}
}