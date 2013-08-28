package com.cc150.recurson_dp;

import java.util.List;

import org.junit.Test;

import com.cc150.recursion_dp.Combination_9_4;

public class CombinationTest_9_4 {
	@Test
	public void testDoCombination(){
		Combination_9_4 c = new Combination_9_4();
		int[] arr = new int[]{1,2,3};
		List<List<Integer>> list = c.doCombination(arr);
		System.out.println(list);
	}
}
