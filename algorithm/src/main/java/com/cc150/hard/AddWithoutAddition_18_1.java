package com.cc150.hard;

public class AddWithoutAddition_18_1 {
	public int add(int a, int b){
		if(b == 0) return a;
		int sumWithoutCarry = a ^ b;
		int carryOnly = (a & b) << 1;
		return add(sumWithoutCarry, carryOnly);
	}
}
