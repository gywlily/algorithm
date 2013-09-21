package com.cc150.tree;

import junit.framework.Assert;

import org.junit.Test;

public class CommonParentTest_4_7 {
	@Test  // two node are in different branches
	public void testGetWithTwoNodeAlongDifBranch(){
		CommonParent_4_7 cp = new CommonParent_4_7();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		Node node1 = root.left.left;
		Node node2 = root.left.right.right;
		Node act = cp.get(root, node1, node2);
		Assert.assertEquals(root.left, act);
	}
	
	@Test
	public void testGetWithTwoNodeAlongSameBranch(){
		CommonParent_4_7 cp = new CommonParent_4_7();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		Node node1 = root.left;
		Node node2 = root.left.right.left;
		Node act = cp.get(root, node1, node2);
		Assert.assertEquals(root, act);
	}
	
	@Test
	public void testGetWithOneNodeIsRoot(){
		CommonParent_4_7 cp = new CommonParent_4_7();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(7);
		Node node1 = root;
		Node node2 = root.left.right.left;
		Node act = cp.get(root, node1, node2);
		Assert.assertNull(act);
	}
}
