package com.offer.tree;

public class VerifyPostOrderBST_24 {
	public boolean verify(int[] arr){
		return verify(arr, 0, arr.length-1);
	}
	
	private boolean verify(int[] arr, int left, int right){
		if(left >= right) return true;
		int root = arr[right];
		int mid = right - 1;
		for(;arr[mid] > root && mid >= left; mid--);
		if(mid < left) return true;
		for(int i = left; i <= mid; i++)
			if(arr[i] > root) return false;
		return verify(arr, left, mid) & verify(arr, mid + 1, right - 1);
	}
}
