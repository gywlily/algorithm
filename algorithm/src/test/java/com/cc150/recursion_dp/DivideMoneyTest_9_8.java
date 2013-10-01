package com.cc150.recursion_dp;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class DivideMoneyTest_9_8 {
	static int money = 60;
	@Test
	public void testDivide(){
		int[] cents = new int[]{25, 10, 5, 1};
		DivideMoney_9_8 dm = new DivideMoney_9_8();
		
		int n = dm.divide(cents, 0, money, "");
		System.out.println("non dp: " + money + " : " + n);
		
		/*for(int i = 1; i < 50; i++){
			int n = dm.divide(cents, 0, i);
			System.out.println(i + " : " + n);
		}*/
	}
}
