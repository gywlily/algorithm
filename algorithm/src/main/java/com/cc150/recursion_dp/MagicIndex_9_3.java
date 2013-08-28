package com.cc150.recursion_dp;

public class MagicIndex_9_3 {
	/**
	 * @param arr 
	 * @param left left boarder of searching range
	 * @param right right boarder of searching range
	 * @return -1 if magic index does not exist, magic index otherwise
	 */
	public int get(int[] arr, int left, int right){
		if(left > right) return -1;
		if(left == right && arr[left] != left)
			return -1;
		int mid = (left + right) / 2;
		if(mid == arr[mid]) return mid;
		else if(mid > arr[mid])
			return get(arr, mid + 1, right);
		else 
			return get(arr, left, mid - 1);
	}
}
