package com.cc150.tree;

import org.junit.Assert;
import org.junit.Test;

import com.cc150.tree.IsBalanceTree_4_1;
import com.cc150.tree.Node;

public class IsBalenceTreeTest {
	@Test
	public void testIsBalence(){
		IsBalanceTree_4_1 ibt = new IsBalanceTree_4_1();
		boolean ret = ibt.isBalance(createBalanceTree());
		Assert.assertEquals(true, ret);
	}
	
	public void testIsUnBalance(){
		IsBalanceTree_4_1 ibt = new IsBalanceTree_4_1();
		boolean ret = ibt.isBalance(createUnBalanceTree());
		Assert.assertEquals(false, ret);
	}
	
	private Node createBalanceTree(){
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		return root;
	}
	
	private Node createUnBalanceTree(){
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right.left = new Node(62);
		return root;
	}
}
