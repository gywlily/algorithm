package com.cc150.list;

import org.junit.Test;

public class FindNthNodeFromEndTest_2_2 {
	@Test
	public void testFind(){
		FindNthNodeFromEnd_2_2 f = new FindNthNodeFromEnd_2_2();
		Node node = f.find(createList(), 6);
		System.out.println(node.value);
	}
	
	private Node createList(){
		 // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        Node cur = head;
        cur.right = new Node(2);
        cur = cur.right;
        cur.right = new Node(3);
        cur = cur.right;
        cur.right = new Node(4);
        cur = cur.right;
        cur.right = new Node(5);
        cur = cur.right;
        cur.right = new Node(6);
        return head;
	}
}	
