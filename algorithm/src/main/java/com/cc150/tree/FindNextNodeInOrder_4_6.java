package com.cc150.tree;

public class FindNextNodeInOrder_4_6 {
	public Node find(Node root, Node nodeToBeFound){
		
		if(root == null) return null;
		if(root == nodeToBeFound)
			if(root.right == null) return new Node(Integer.MIN_VALUE);
			else return getMostLeftOnRight(root.right);		
		Node retNode = find(root.left, nodeToBeFound);
		if(retNode == null){ // nodeToBeFound not found on left sub tree
			retNode = find(root.right, nodeToBeFound); // searching right sub tree for nodeToBeFound
			if(retNode == null)
				return null;
			else // if the nodeToBeFound found on right subtree, then return retNode
				return retNode;				
		}else { // if the nodeToBeFound found on left subtree, 
			if (retNode.value == Integer.MIN_VALUE) // nodeToBeFound has no right child
				return root;  // return current node as 'next' node
			else // if nodeToBeFound has right child
				return retNode;   // retNode is the 'next' node
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
