package com.offer;

public class Fibonacci_9 {
	public int calc(int n){
		if(n == 1 || n == 2) return n;
		int[] arr = new int[n + 1];
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3; i <= n; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];	
	}
}
