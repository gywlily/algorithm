package com.cc150.list;

import org.junit.Test;

public class PartitionListTest_2_4 {
	@Test
	public void testPartition(){
		PartitionList_2_4 pl = new PartitionList_2_4();
		Node root = new Node(8);
		root.right = new Node(1);
		root.right.right = new Node(7);
		root.right.right.right = new Node(5);
		root.right.right.right.right = new Node(3);
		root.right.right.right.right.right = new Node(10);
		
		// Node ret  = pl.partition(root, 5);
		// Node ret  = pl.partition(root, 8);
		Node ret  = pl.partition(root, 1);
		while(ret != null){
			System.out.println(ret.value + "\t");
			ret = ret.right;
		}
	}
}
