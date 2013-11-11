package com.cc150.sort_search;


public class QuickSort {
	public void sort(int[] arr){
		sort(arr, 0, arr.length - 1);
	}
	
	public void sort(Object[] objs){
		
	}
	
	private void sort(int[] arr, int left, int right){
		if(left < right){
			int index = partition(arr, left, right);
			sort(arr, left, index - 1);
			sort(arr, index + 1, right);
		}
	}
	
	private int partition(int[] arr, int left, int right){
		int j = left - 1;
		for(int i = left; i < right; i++){
			if(arr[i] < arr[right]){
				j++;
				swap(arr, i, j);
			}
		}
		swap(arr, j + 1, right);
		return j + 1;
	}
	
	private void swap(int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
