package com.cc150.moderate;

public class SortSubArray_17_6 {
	public void findMinMaxIndex(int[] arr){
		int left = 1;
		for(; left < arr.length; left++)
			if(arr[left] < arr[left - 1])
				break;
		
		if(left == arr.length) // 已经排好序
			return;
		int right = arr.length - 2;
		for(;right >= 0; right--)
			if(arr[right] > arr[right + 1])
				break;
		// find the min and max in the middle part
		int min = 0, max = 0;
		for(int i = left; i <= right; i++){
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		while(left > 0 && arr[left - 1] > min) left--;
		while(right < arr.length - 1 && arr[right + 1] < max) right++;
		
		for(int i = left; i <= right; i++){
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > min){
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
