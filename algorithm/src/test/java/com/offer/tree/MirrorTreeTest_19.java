package com.offer.tree;

import org.junit.Test;

public class MirrorTreeTest_19 {
	@Test
	public void testMirror(){
		MirrorTree_19 mt = new MirrorTree_19();
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(7);
		root.right = new Node(10);
		root.right.left = new Node(9);
		root.right.right = new Node(11);
		mt.mirror(root);
		System.out.println(root.value);
	}
}
