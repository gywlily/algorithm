package com.cc150.hard;

import java.util.Arrays;
import java.util.Random;

public class RandGenerator_18_3 {
	public int[] generate(int[] arr, int m){
		if(arr.length < m) return new int[0];
		if(arr.length == m) return arr;
		Random rand = new Random();
		for(int i = m; i < arr.length; i++){
			int r = rand.nextInt(i);
			if(r < m)
				swap(arr, r, i);
		}
		return Arrays.copyOf(arr, m);
	}
	
	private void swap(int[] arr, int left, int right){
		int t = arr[left];
		arr[left] = arr[right];
		arr[right] = t;
	}
}
