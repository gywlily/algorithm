package com.offer.list;

public class MergeList_17 {
	public Node merge(Node h1, Node h2){
		if(h1 == null) return h2;
		if(h2 == null) return h1;
		Node cur1 = h1, cur2 = h2;
		while(cur1 != null && cur2 != null){
			if(cur1.value <= cur2.value){
				Node temp = cur1.right;
				cur1.right = cur2;
				cur1 = temp;
			} else {
				Node temp = cur2.right;
				cur2.right = cur1;
				cur2 = temp;
			}
		}
		return h1.value <= h2.value ? h1 : h2;
	}
}
