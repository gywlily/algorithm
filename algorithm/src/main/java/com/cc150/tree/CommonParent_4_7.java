package com.cc150.tree;

import java.util.ArrayList;
import java.util.Collections;

public class CommonParent_4_7 {
	public Node get(Node root, Node node1, Node node2){
		if(root == null || node1 == null || node2 == null) return null;
		ArrayList<Node> list = new ArrayList<Node>();
		Collections.addAll(list, node1, node2);
		return getCommonParent(root, list);
	}
	
	private Node getCommonParent(Node root, ArrayList<Node> list){
		if(root == null) return null;
		for(Node node: list)
			if(node == root){
				list.remove(node);
				break;
			}
		int size = list.size();
		if(size == 0) return null;
		Node node = getCommonParent(root.left, list);
		if(node != null) return node;
		if(list.size() == 0)
			if(size == 2)
				return root;
			else
				return null;
		else{
			node = getCommonParent(root.right, list);
			if(node != null) return node;
			if(list.size() == 0 && size == 2)
				return root;
			return null;
		}
	}
}
