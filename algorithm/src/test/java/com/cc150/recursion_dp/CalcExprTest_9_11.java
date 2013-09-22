package com.cc150.recursion_dp;

import org.junit.Test;

public class CalcExprTest_9_11 {
	@Test
	public void testCalc(){
		CalcExpr_9_11 ce = new CalcExpr_9_11();
		int count = ce.calc("1^0|0|1", true);
		System.out.println(count);
	}
}
