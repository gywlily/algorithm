package com.cc150.moderate;

import org.junit.Test;

public class BstToDllTest_17_13 {
	@Test
	public void testConvert(){
		BstToDll_17_13 btd = new BstToDll_17_13();
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(14);
		root.right.left = new Node(12);
		root.right.right = new Node(16);
		Node ret = btd.convert(root);
		while(ret != null){
			System.out.print(ret.value + "\t");
			if(ret.right == null) break;
			ret = ret.right;
		}
		System.out.println();
		while(ret != null){
			System.out.print(ret.value + "\t");
			if(ret.left == null) break;
			ret = ret.left;
		}
		
	}
}
