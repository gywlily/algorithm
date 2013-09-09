package com.cc150.list;

public class PartitionList_2_4 {
	public Node partition(Node root, int x){
		Node head = new Node(0), cur = new Node(0);
		Node curNode1 = root, curNode2 = null, valueNode = new Node(0);
		while(curNode1 != null){
			curNode2 = curNode1.right;
			if(curNode1.value < x){
				curNode1.right = head.right;
				head.right = curNode1;
			} else if(curNode1.value > x){
				curNode1.right = cur.right;
				cur.right = curNode1;
			} else {
				curNode1.right = valueNode.right;
				valueNode.right = curNode1;
			}
			curNode1 = curNode2;
		}
		curNode1 = head;
		while(curNode1.right != null)
			curNode1 = curNode1.right;
		curNode1.right = valueNode.right;
		while(curNode1.right != null)
			curNode1 = curNode1.right;
		curNode1.right = cur.right;
		return head.right;
	}
}
