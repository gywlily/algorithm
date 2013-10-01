package com.leetcode.list;

import org.junit.Test;

public class ReverseNodeInKGroupTest {
	@Test
	public void testReverse(){
		ReverseNodeInKGroup rnk = new ReverseNodeInKGroup();		
		for(int i = 1; i < 12; i++){
			Node root = rnk.reverse(createList(), i);
			Node curNode = root;
			while(curNode != null){
				System.out.print(curNode.value + " ");
				curNode = curNode.right;
			}
			System.out.println();
		}
	}
	
	private Node createList(){
		Node root = new Node(1);
		Node curNode = root;
		for(int i = 2; i < 10; i++){
			curNode.right = new Node(i);
			curNode = curNode.right;
		}
		return root;
	}
}
