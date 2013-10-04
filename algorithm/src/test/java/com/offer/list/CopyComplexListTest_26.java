package com.offer.list;

import org.junit.Test;

public class CopyComplexListTest_26 {
	@Test
	public void testCopy(){
		CopyComplexList_26 cc = new CopyComplexList_26();
		Node root = new Node(1);
		root.right = new Node(2);
		root.right.right = new Node(3);
		root.right.right.right = new Node(4);
		root.right.right.right.right = new Node(5);
		root.left = root.right.right;
		root.right.left = root.right.right.right.right;
		root.right.right.right.left = root.right;
		Node actual = cc.copy(root);
		System.out.println(actual.value);
	}
}
