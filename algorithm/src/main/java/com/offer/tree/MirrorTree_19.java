package com.offer.tree;

public class MirrorTree_19 {
	public void mirror(Node root){
		if(root == null) return;
		Node tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		mirror(root.left);
		mirror(root.right);
	}
}
