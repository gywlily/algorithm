package com.cc150.list;

import java.util.Arrays;

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
	
	public Node partition2(Node head, int x){
		Node[][] nodes = new Node[3][2];
		Node cur = head;
		while(cur != null){
			if(cur.value == x){
				insertNode(nodes, cur, 1);
			} else if(cur.value < x){
				insertNode(nodes, cur, 0);
			} else 
				insertNode(nodes, cur, 2);
			cur = cur.right;
		}
		
		if(nodes[0][1] != null){
			if(nodes[1][0] != null)
				nodes[0][1].right = nodes[1][0];
			else
				nodes[0][1].right = nodes[2][0];			
		}
		if(nodes[1][1] != null)
			nodes[1][1].right = nodes[2][0];
		return nodes[0][0] != null ? nodes[0][0] : nodes[1][0] != null ? nodes[1][0] : nodes[2][0];
	}
	
	public void insertNode(Node[][] nodes, Node newNode, int index){
		if(nodes[index][0] == null){
			nodes[index][0] = newNode;
			nodes[index][1] = newNode;
		} else{
			nodes[index][1].right=newNode;
			nodes[index][1] = newNode;
		}
	}
}
