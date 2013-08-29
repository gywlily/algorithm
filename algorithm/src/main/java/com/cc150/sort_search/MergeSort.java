package com.cc150.sort_search;

public class MergeSort {
	public void sort(int[] arr){
		if(arr == null || arr.length <= 1)
			return;
		split(arr, 0, arr.length - 1);
	}
	
	public void split(int[] arr, int left, int right){
		if(left < right){
			int mid = (left + right) / 2;
			split(arr, left, mid);
			split(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public void merge(int[] arr, int left, int mid, int right){
		int[] assist = new int[right - left + 1];
		int l = left, m = mid + 1, index = 0;
		while(l <= mid && m <= right){
			assist[index++] = arr[l] < arr[m] ? arr[l++] : arr[m++];
		}
		while(l <= mid)
			assist[index++] = arr[l++];
		
		for(int i = left; i < m; i++)
			arr[i] = assist[i - left];  
	}
}
