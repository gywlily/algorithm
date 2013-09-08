package com.cc150.tree;

public class IsBST_4_5 {
	public boolean isBst(Node root){
		Pair pleft = bst(root.left);
		Pair pright = bst(root.right);
		return (pleft != null && pright != null && root.value > pleft.max && root.value < pright.min);
	}
	
	public Pair bst(Node root){
		if(root == null) return new Pair();
		Pair pleft = bst(root.left);
		Pair pright = bst(root.right);
		if(pleft == null || pright == null || 
				root.value < pleft.max || root.value > pright.min)
			return null;
		int min = root.value < pleft.min ? root.value : pleft.min;
		int max = root.value > pright.max ? root.value : pright.max;
		return new Pair(min, max);
	}
}

class Pair
{
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	public Pair(){}
	public Pair(int min, int max){
		this.min = min;
		this.max = max;
	}
}