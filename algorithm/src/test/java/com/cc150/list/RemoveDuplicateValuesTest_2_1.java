package com.cc150.list;

import org.junit.Ignore;
import org.junit.Test;

public class RemoveDuplicateValuesTest_2_1 {
	@Test
	@Ignore
	public void testRemoveBruteForcely(){
		RemoveDuplicateValues_2_1 r = new RemoveDuplicateValues_2_1();
		Node head = new Node(1);
		head.right = new Node(2);
		head.right.right = new Node(3);
		head.right.right.right = new Node(2);
		r.removeBruteForcely(head);
		while(head != null){
			System.out.println(head.value + ",");
			head = head.right;
		}
	}
	
	@Test
	public void testRemoveWishHashTable(){
		RemoveDuplicateValues_2_1 r = new RemoveDuplicateValues_2_1();
		Node head = new Node(1);
		head.right = new Node(2);
		head.right.right = new Node(2);
		//head.right.right.right = new Node(2);
		r.removeWishHashTable(head);
		while(head != null){
			System.out.println(head.value + ",");
			head = head.right;
		}
	}
}
