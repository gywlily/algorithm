package com.cc150.recursion_dp;

public class DivideMoney_9_8 {
	public int divide(int[] cents, int index, int money, String s){
		if(cents[index] == 1) {System.out.println(s); return 1;}
		int n = money / cents[index], count = 0;
		for(int i = n; i >= 0; i--){
			//System.out.println("x");
			count += divide(cents, index + 1, money - cents[index] * i, s + "," + cents[index] + "x" + i);
		}
		return count;
	}
}
