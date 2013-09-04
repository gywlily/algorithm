package com.cc150.sort_search;

public class SearchRotatedArray_11_3 {
	public int search(int[] arr, int value){
		return search(arr, value, 0, arr.length -1); 
	}
	
	private int search(int[] arr, int value, int left, int right){
		if(left > right) return Integer.MIN_VALUE;
		
		int mid = (left + right) / 2;
		if(arr[mid] == value)
			return mid;
		if(arr[mid] > arr[left] && arr[mid] < arr[right])
			if(arr[mid] > value)
				return search(arr, value, left,  mid - 1);
			else return search(arr, value, mid + 1, right);
		
		if(arr[mid] > arr[left] && arr[mid] > arr[right])
			if(arr[mid] > value){
				int ret = search(arr, value, left, mid - 1);
				if(ret != Integer.MIN_VALUE)
					return ret;
				return search(arr, value, mid + 1, right);
			}
		
		if(arr[mid] < arr[left] && arr[mid] < arr[right])
			if(arr[mid] > value)
				return search(arr, value, left,  mid -1);
			else {
				int ret = search(arr, value, mid + 1, right);
				if(ret != Integer.MIN_VALUE)
					return ret;
				return search(arr, value, left, mid - 1);
			}
		return Integer.MIN_VALUE;
	}
}
