package com.cc150.recursion_dp;

import java.util.ArrayList;

import org.junit.Test;

import com.cc150.recursion_dp.PrintParenthesis_9_6;

public class PrintParenthesisTest_9_6 {
	@Test
	public void testPrint(){
		ArrayList<String> list = new ArrayList<String>();
		PrintParenthesis_9_6 pp = new PrintParenthesis_9_6();
		pp.print(3, 3, "", list);
		System.out.println(list);
	}
}
