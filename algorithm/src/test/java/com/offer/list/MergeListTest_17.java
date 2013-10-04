package com.offer.list;

import org.junit.Test;

public class MergeListTest_17 {
	@Test
	public void testMerge(){
		MergeList_17 ml = new MergeList_17();
		Node h1 = new Node(1);
		h1.right = new Node(3);
		Node h2 = new Node(2);
		h2.right = new Node(4);
		h1.right.right = new Node(8);
		Node actual = ml.merge(h1, h2);
		while(actual != null){
			System.out.println(actual.value);
			actual = actual.right;
		}
	}
}
