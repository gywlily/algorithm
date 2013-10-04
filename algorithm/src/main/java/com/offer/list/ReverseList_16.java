package com.offer.list;

public class ReverseList_16 {
	public Node reverse(Node head){
		if(head == null || head.right == null)
			return head;
		Node left, mid, right;
		left = null;
		mid = head;
		right = head.right;
		while(mid != null){
			mid.right = left;
			left = mid;
			mid = right;
			if(right != null)
				right = right.right;
		}
		return left;
	}
}
