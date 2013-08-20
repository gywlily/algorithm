package com.cc150.tree;

import org.junit.Assert;
import org.junit.Test;

public class FindNextNodeInOrder_4_6Test {
	@Test
	public void testFind(){
		FindNextNodeInOrder_4_6 fnn = new FindNextNodeInOrder_4_6();
		Node root = createTree();
		Node act = fnn.find(root, root);
		Assert.assertEquals(root.right, act);
	}
	
	@Test  // not found the node to be found
	public void testFindNothing(){
		FindNextNodeInOrder_4_6 fnn = new FindNextNodeInOrder_4_6();
		Node root = createTree();
		Node act = fnn.find(root, new Node(10));
		Assert.assertNull(act);
	}
	
	@Test  // found the node to be found has no successor
	public void testFindNoSuccess(){
		FindNextNodeInOrder_4_6 fnn = new FindNextNodeInOrder_4_6();
		Node root = createTree();
		Node act = fnn.find(root, root.right);
		Assert.assertEquals(Integer.MIN_VALUE, act.value);
	}
	
	@Test  // found the node to be the most right of left subtree
	public void testFindMostRight(){
		FindNextNodeInOrder_4_6 fnn = new FindNextNodeInOrder_4_6();
		Node root = createTree();
		Node act = fnn.find(root, root.left.right.right);
		Assert.assertEquals(root, act);
	}
	
	private Node createTree(){
		Node root = new Node(7);
		root.right = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(5);
		root.left.right = new Node(8);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(9);
		return root;
	}
}
