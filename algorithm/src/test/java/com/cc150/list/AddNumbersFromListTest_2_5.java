package com.cc150.list;

import org.junit.Test;

public class AddNumbersFromListTest_2_5 {
	@Test
	public void testAdd(){
		AddNumbersFromList_2_5 a = new AddNumbersFromList_2_5();
		Node h1 = new Node(7);
		h1.right = new Node(1);
		//h1.right.right = new Node(6);
		Node h2 = new Node(5);
		h2.right = new Node(9);
		h2.right.right = new Node(2);
		System.out.println(a.add(h1, h2));
	}
}
