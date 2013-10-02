package com.cc150.moderate;

public class BstToDll_17_13 {
	public Node convert(Node root){
		if(root == null) return null;
		Node lastNode = null;
		lastNode = convert(root, lastNode);
		while(lastNode.left != null)
			lastNode = lastNode.left;
		return lastNode;
	}
	
	public Node convert(Node root, Node lastNode){
		if(root.left != null)
			lastNode = convert(root.left, lastNode);
		root.left = lastNode;
		if(lastNode != null)
			lastNode.right = root;
		lastNode = root;
		if(root.right != null)
			lastNode = convert(root.right, lastNode);
		return lastNode;
	}
}
