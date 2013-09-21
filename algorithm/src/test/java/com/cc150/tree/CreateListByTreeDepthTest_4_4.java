package com.cc150.tree;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CreateListByTreeDepthTest_4_4 {
	@Test
	@Ignore
	public void testCreate(){
		CreateListByTreeDepth_4_4 clbt = new CreateListByTreeDepth_4_4();
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.left.right = new Node(8);
		List<List<Node>> list = clbt.create(root) ;
		System.out.println(list);
	}
	
	@Test
	public void testCreateList(){
		CreateListByTreeDepth_4_4 clbt = new CreateListByTreeDepth_4_4();
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(20);
		root.left.right = new Node(8);
		List<Node> list = clbt.createList(root);
		System.out.println(list);
	}
}
