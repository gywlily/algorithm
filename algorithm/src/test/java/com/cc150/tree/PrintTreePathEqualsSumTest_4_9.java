package com.cc150.tree;

import java.util.List;

import org.junit.Test;

public class PrintTreePathEqualsSumTest_4_9 {
	@Test
	public void testPrint(){
		PrintTreePathEqualsSum_4_9 ptpes = new PrintTreePathEqualsSum_4_9();
		Node root = createTree();
		List<List<Integer>> list = ptpes.print(root, 10);
		System.out.println(list);
	}
	
	private Node createTree(){
		Node root = new Node(7);
		root.right = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(5);
		root.left.left.right = new Node(10);
		root.left.right = new Node(8);
		root.left.right.left = new Node(6);
		root.left.right.right = new Node(9);
		return root;
	}
}
