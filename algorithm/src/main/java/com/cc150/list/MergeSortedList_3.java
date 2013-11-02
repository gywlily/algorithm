package com.cc150.list;

public class MergeSortedList_3 {
	public Node mergeList(Node head1, Node head2){
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		Node cur1 = head1, cur2 = head2; 
		Node head = null, cur = null;
		while(cur1 != null && cur2 != null){
			if(cur1.value <= cur2.value){
				if(head == null) {
					head = cur1;
					cur = head;
				} else {
					cur.right = cur1;
					cur = cur.right;
				}
				cur1 = cur1.right;
			} else {
				if(head == null){
					head = cur2;
					cur = head;
				} else{
					cur.right = cur2;
					cur = cur.right;
				}
				cur2 = cur2.right;
			}
		}
		if(cur1 == null)
			cur.right = cur2;
		else
			cur.right = cur1;
		
		return 	head;
	}
}
