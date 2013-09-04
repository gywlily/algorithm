package com.cc150.sort_search;

public class SearchEmptyStringInterspersedArray_11_5 {
	public int search(String[] arr, String value){
		return search(arr, value, 0, arr.length - 1);
	}
	
	public int search(String[] arr, String value, int left, int right){
		if(left > right) return Integer.MIN_VALUE;
		int mid = (left+ right) / 2;
		if(arr[mid].equals(value)) return mid;
		int tempMid = mid;
		while(mid >= left && arr[mid].isEmpty()) mid--;
		if(mid >= left)
			if(arr[mid] == value) return mid;
			else if(arr[mid].compareTo(value) > 0) return search(arr, value, left, mid - 1);
		mid = tempMid;
		while(mid <= right && arr[mid].isEmpty()) mid++;
		if(mid <= right)
			if(arr[mid] == value) return mid;
			else return search(arr, value, mid + 1, right);
		return Integer.MIN_VALUE;
	}
}
