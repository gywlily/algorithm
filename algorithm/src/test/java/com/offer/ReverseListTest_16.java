package com.offer;

import junit.framework.Assert;

import org.junit.Test;

public class ReverseListTest_16 {
	@Test
	public void testReverseWithHeadNull(){
		ReverseList_16 rl = new ReverseList_16();
		Node ret = rl.reverse(null);
		Assert.assertNull(ret);
	}
	
	@Test
	public void testReverseWithOneNode(){
		ReverseList_16 rl = new ReverseList_16();
		Node ret = rl.reverse(new Node(10));
		printList(ret);
	}
	
	@Test
	public void testReverseWithMultipleNode(){
		ReverseList_16 rl = new ReverseList_16();
		Node head = new Node(10);
		head.right = new Node(11);
		head.right.right = new Node(12);
		Node ret = rl.reverse(head);
		printList(ret);
	}
	
	public void printList(Node head){
		Node cur = head;
		while(cur != null){
			System.out.println(cur.value);
			cur = cur.right;
		}
	}
}
