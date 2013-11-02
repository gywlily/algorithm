package com.cc150.list;

import org.junit.Test;

public class MergeSortedListTest_3 {
	@Test
	public void testMerge(){
		// 1-5-9, 3-7-9-19
		MergeSortedList_3 m = new MergeSortedList_3();
		Node head1 = new Node(1);
		head1.right = new Node(5);
		head1.right.right = new Node(9);
		Node head2 = new Node(3);
		head2.right = new Node(7);
		head2.right.right = new Node(9);
		head2.right.right.right = new Node(19);
		Node ret = m.mergeList(head1, head2); 
		while(ret != null){
			System.out.print(ret.value + ",");
			ret = ret.right;
		}
	}
}
