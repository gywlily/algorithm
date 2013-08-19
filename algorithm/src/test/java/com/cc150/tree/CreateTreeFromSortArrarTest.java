package com.cc150.tree;

import junit.framework.Assert;

import org.junit.Test;

public class CreateTreeFromSortArrarTest {
	@Test
	public void testCreateTreeFromSortArray(){
		CreateTreeFromSortArray_4_3 ctfa = new CreateTreeFromSortArray_4_3();
		int[] arr = new int[]{1,2,3,4,5,6};
		Node root = ctfa.createTreeFromSortArray(arr);
		Node expect = new Node(3);
		expect.left = new Node(1);
		expect.left.right =new Node(2);
		expect.right = new Node(5);
		expect.right.left = new Node(4);
		expect.right.right =new Node(6);

		Assert.assertEquals(true, isTreeSame(root, expect));		
	}
	
	private boolean isTreeSame(Node actural, Node expect){
		if(actural == null && expect == null) return true;
		else if(actural == null || expect == null) return false;
		if(actural.value != expect.value) return false;
		return isTreeSame(actural.left, expect.left) & isTreeSame(actural.right, expect.right);
	}
}
