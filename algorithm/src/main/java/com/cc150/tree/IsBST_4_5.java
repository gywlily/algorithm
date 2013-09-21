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
	
	public boolean anotherIsBst(Node root){
		if(root == null) return true;
		int left = anotherIsBst(root.left, 0);
		int right = anotherIsBst(root.right, 1);
		return (root.value > left && root.value <= right);
	}
	
	/*
	 * lr : left = 0, right = 1
	 */
	public int anotherIsBst(Node root, int lr){
		if(root == null)
			if(lr == 0)
				return Integer.MIN_VALUE;
			else
				return Integer.MAX_VALUE;
		int left = anotherIsBst(root.left, 0);
		int right = anotherIsBst(root.right, 1);
		if(root.value <= left || root.value > right)
			return lr == 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		return lr == 0 ? right == Integer.MAX_VALUE ? root.value : right : left == Integer.MIN_VALUE ? root.value : left;
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