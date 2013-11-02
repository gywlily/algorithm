package com.cc150.list;

import org.junit.Test;

public class FindFirstNodeInLoopListTest_2_6 {
	@Test
	public void testFind(){
		FindFirstNodeInLoopList_2_6 f = new FindFirstNodeInLoopList_2_6();
		Node head = new Node(1);
		Node cur = head;
		cur.right = new Node(2);
		cur.right.right = new Node(3);
		cur.right.right.right = new Node(4);
		// cur.right.right.right.right = cur.right; // 指向2
		// cur.right.right.right.right = cur.right.right.right;  // 指向自己4
		
		Node ret = f.find(head);
		System.out.println(ret.value);
	}
}
