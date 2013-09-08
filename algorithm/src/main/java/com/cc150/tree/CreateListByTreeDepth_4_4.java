package com.cc150.tree;

import java.util.LinkedList;
import java.util.List;

public class CreateListByTreeDepth_4_4 {
	public List<List<Node>> create(Node root){
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		LinkedList<List<Node>> resultList = new LinkedList<List<Node>>();
		resultList.add(queue);
		while(true){
			LinkedList<Node> list = new LinkedList<Node>();
			for(Node node : queue){
				if(node.left != null)
					list.add(node.left);
				if(node.right != null)
					list.add(node.right);
			}
			if(list.size() <= 0)
				break;
			resultList.add(list);
			queue = list;
		}
		
		return resultList;
		
	}
}
