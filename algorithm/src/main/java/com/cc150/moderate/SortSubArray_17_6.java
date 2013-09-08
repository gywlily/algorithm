package com.cc150.moderate;

public class SortSubArray_17_6 {
	public void findMinMaxIndex(int[] arr){
		int left = 1, max = Integer.MIN_VALUE;
		for(; left < arr.length; left++){
			if(arr[left] < arr[left - 1]){
				max = arr[left - 1];
				break;
			}
		}
		if(left == arr.length)
			return;
		int right = arr.length - 2, min = 0;
		for(;arr[right] <= arr[right + 1]; right--){}
		min = arr[right + 1];
		
		for(int i = left; i <= right; i++){
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= min){
				System.out.println(i);
				break;
			}
		}
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] <= max){
				System.out.println(i);
				break;
			}
		}
	}
}
