package com.cc150.recursion_dp;

import org.junit.Test;

import com.cc150.recursion_dp.DivideMoney_9_8;

public class DivideMoneyTest_9_8 {
	@Test
	public void testDivide(){
		int[] cents = new int[]{25, 10, 5, 1};
		DivideMoney_9_8 dm = new DivideMoney_9_8();
		for(int i = 1; i < 50; i++){
			int n = dm.divide(cents, 0, i);
			System.out.println(i + " : " + n);
		}
	}
}
