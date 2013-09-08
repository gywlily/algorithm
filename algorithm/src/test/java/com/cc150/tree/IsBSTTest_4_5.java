package com.cc150.tree;

import junit.framework.Assert;

import org.junit.Test;

public class IsBSTTest_4_5 {
	@Test
	public void testIsNotBst(){
		IsBST_4_5 ib = new IsBST_4_5();
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.left.right = new Node(12);
		boolean b = ib.isBst(root);
		Assert.assertFalse(b);
	}
	
	@Test
	public void testIsBst(){
		IsBST_4_5 ib = new IsBST_4_5();
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.left.right = new Node(8);
		boolean b = ib.isBst(root);
		Assert.assertTrue(b);
	}
}
