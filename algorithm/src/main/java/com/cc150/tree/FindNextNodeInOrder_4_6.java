package com.cc150.tree;

public class FindNextNodeInOrder_4_6 {
	public Node find(Node root, Node nodeToBeFound){
		if(root == null) return null;
		if(root == nodeToBeFound)
			if(root.right != null)
				return getMostLeftOnRight(root.right);
			else return new Node(Integer.MIN_VALUE);
		else{
			Node node = find(root.left, nodeToBeFound);
			if(node == null)
				return node;
			else node = find(node.right, nodeToBeFound);
			return node;
		}
	}
	
	public Node getMostLeftOnRight(Node node){
		if(node.left == null) return node;
		else{
			while(node.left != null) 
				node = node.left;
			return node;
		}
	}
}
