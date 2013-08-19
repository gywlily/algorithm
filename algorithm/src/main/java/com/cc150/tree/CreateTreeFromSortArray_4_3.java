package com.cc150.tree;

public class CreateTreeFromSortArray_4_3 {
	public Node createTreeFromSortArray(int[] arr){
		if(arr == null || arr.length == 0) return null;
		int mid = (arr.length - 1) / 2;
		Node root = new Node(arr[mid]);
		root.left = createSubTree(arr, 0, mid - 1);
		root.right = createSubTree(arr, mid + 1, arr.length - 1);
		return root;
	}
	
	public Node createSubTree(int[] arr, int left, int right){
		if(left > right) return null;
		int mid = (left + right) / 2;
		Node root = new Node(arr[mid]);
		root.left = createSubTree(arr, left, mid - 1);
		root.right = createSubTree(arr, mid + 1, right);
		return root;
	}
}
