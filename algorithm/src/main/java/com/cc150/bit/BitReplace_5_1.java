package com.cc150.bit;

// input n=10000000000 m=10011 i=2 j=6
// output :  10001001100

public class BitReplace_5_1 {
	public long replace(long n, int m, int i, int j){
		// 
		long temp = (1 << (j+1)) - 1;  // 00001111111
		temp = temp & (temp << i);  // 00001111100
		
		temp = ~temp; // 11110000011
		temp = temp & n;  // xxxx00000xx
		return (m << i) ^ temp;
	}
}
