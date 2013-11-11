package com.cc150.sort_search;

public class MergeTwoArray_11_1 {
	public void merge(int[] arr1, int[] arr2){
		int index1 = 0;
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] == '\0')
				break;
			index1 = i;
		}
		int index2 = arr2.length - 1;
		int index = index1 + 1 + index2;
		while(index1 >= 0 || index2 >= 0){
			if(arr1[index1] >= arr2[index2])
				arr1[index] = arr1[index1--];
			else
				arr1[index] = arr2[index2--];
			index--;
		}
		while(index1 >= 0)
			arr1[index--] = arr1[index1--];
		while(index2 >= 0)
			arr1[index--] = arr2[index2--];
	}
}
