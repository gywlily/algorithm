package com.offer.moderate;

public class GetNumberOfReversedPair_36 {
	public int get(int[] arr){
		return get(arr, 0, arr.length - 1);
	}
	
	private int get(int[] arr, int left, int right){
		if(left >= right) return 0;
		int mid = (left + right) / 2;
		int count = get(arr, left, mid);
		count += get(arr, mid + 1, right);
		int p1 = mid, p2 = right;
		while(true){
			if(arr[p1] > arr[p2]){
				count += (p2 - mid);
				p1--;
			} else
				p2--;
			if(p1 < left || p2 <= mid)
				break;
		}
		merge(arr, left, mid, right);
		return count;
	}
	private void merge(int[] arr, int left, int mid, int right){
		int[] arr1 = new int[right - left + 1];
		int i1 = left, i2 = mid + 1, i = 0;
		while(i1 <= mid && i2 <= right){
			arr1[i++] = arr[i1] < arr[i2] ? arr[i1++] : arr[i2++];
		}
		while(i1 <= mid){
			arr1[i++] = arr[i1++];
		}
		System.arraycopy(arr1, 0, arr, left, i);
	}
}
