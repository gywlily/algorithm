package com.leetcode.list;

import org.junit.Test;

public class ReverseNodeInKGroupTest {
	@Test
	public void testReverse(){
		ReverseNodeInKGroup rnk = new ReverseNodeInKGroup();
		Node root = new Node(1);
		Node curNode = root;
		for(int i = 2; i < 10; i++){
			curNode.right = new Node(i);
			curNode = curNode.right;
		}
		rnk.reverse(root, 2);
		curNode = root;
		while(curNode != null){
			System.out.println(curNode.value);
			curNode = curNode.right;
		}
	}
}
