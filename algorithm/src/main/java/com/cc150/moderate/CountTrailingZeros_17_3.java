package com.cc150.moderate;

public class CountTrailingZeros_17_3 {
	public int count(int n){
		int c = 0;
		for(int i = 5; n > i; i *= 5){
			c += n / i;
		}
		return c;
	}
}
