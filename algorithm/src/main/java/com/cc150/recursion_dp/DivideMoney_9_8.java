package com.cc150.recursion_dp;

public class DivideMoney_9_8 {
	public int divide(int[] cents, int index, int money){
		int cur = cents[index];
		if(cur == 1) return 1;
		
		int n = money / cur;
		int count = 0;
		for(int i = n; i >= 0; i--){
			count += divide(cents, index + 1, money - cur * i);
		}
		return count;
	}
}
