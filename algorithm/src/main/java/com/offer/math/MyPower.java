package com.offer.math;

public class MyPower {
	public int calc(int v, int n){
		if(n == 0) return 1;
		if(n == 1) return v;
		int result = v, p = 1;
		while(p*2 <= n){
			result *= result;
			p *= 2;
		}
		for(int i = 0; i < n - p; i++)
			result *= v;
		return result;
	}
}
