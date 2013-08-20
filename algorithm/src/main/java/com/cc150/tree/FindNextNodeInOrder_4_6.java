package com.cc150.tree;

public class FindNextNodeInOrder_4_6 {
	public Node find(Node root, Node nodeToBeFound){
		if(root == null) return null;
		if(root == nodeToBeFound)
			if(root.right == null) return new Node(Integer.MIN_VALUE);
			else return getMostLeftOnRight(root.right);		
		Node retNode = find(root.left, nodeToBeFound);
		if(retNode == null){ // not found on left sub tree
			retNode = find(root.right, nodeToBeFound);
			if(retNode == null)
				return null;
			else 
				return retNode;				
		}else if (retNode.value == Integer.MIN_VALUE) // found the last node
			return root;
		else
			return retNode;		
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
