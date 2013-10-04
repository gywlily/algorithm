package com.offer.list;

import org.junit.Test;

public class ReverseDLLTest {
	@Test
	public void testReverseDLL(){
		ReverseDLL rd = new ReverseDLL();
		Node head = new Node(1);
		head.right = new Node(2);
		head.right.left = head;
		Node actual = rd.reverse(head);
		System.out.println(actual.value);
	}
}
