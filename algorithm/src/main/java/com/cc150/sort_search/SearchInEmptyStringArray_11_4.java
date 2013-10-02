package com.cc150.sort_search;

public class SearchInEmptyStringArray_11_4 {
	public int searchString(String[] arr, String value){
		return searchString(arr, value, 0, arr.length - 1);
	}
	
	private int searchString(String[] arr, String value, int left, int right){
		if(left > right) return -1;
		int mid = (left + right) / 2;
		int m1 = mid, m2 = mid;
		while(arr[m1].equals("") && m1 >= left) m1++;
		while(arr[m2].equals("") && m2 <= right) m2--;
		if(m1 < left && m2 > right) return -1;
		if(m1 >= left && arr[m1].equals(value)) return m1;
		if(m2 <= right && arr[m2].equals(value)) return m2;		
		if(m1 < left && arr[m2].compareTo(value) < 0)
			return searchString(arr, value, m2+1, right);
		if(m2 > right && arr[m1].compareTo(value) > 0)
			return searchString(arr, value, left, m1-1);
		if(arr[m1].compareTo(value) > 0)
			return searchString(arr, value, left, m1-1);
		else 
			return searchString(arr, value, m2+1, right);
	}
}
