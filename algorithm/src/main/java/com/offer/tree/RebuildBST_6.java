package com.offer.tree;


public class RebuildBST_6 {
	public Node rebuild(int[] arr1, int[] arr2){
		return rebuild(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
	}
	
	public Node rebuild(int[] arr1, int s1, int e1, int[] arr2, int s2, int e2){
		if(s1 > e1 || s2 > e2) return null;
		Node root = new Node(arr1[s1]);
		int leftmid;
		for(leftmid = s2; leftmid <= e2; leftmid++)
			if(root.getValue() == arr2[leftmid])
				break;
		int leftlen = leftmid - s2, rightlen = e2 - leftmid;
		root.left = rebuild(arr1, s1 + 1, s1 + 1 + leftlen - 1, arr2, s2, leftmid - 1);
		root.right = rebuild(arr1, s1 + leftlen + 1, s1 + leftlen + 1 + rightlen - 1, arr2, leftmid + 1, e2);
		return root;
	}
}
