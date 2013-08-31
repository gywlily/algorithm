package com.cc150.recurson_dp;

import java.util.List;

import org.junit.Test;

import com.cc150.recursion_dp.Permutation_9_5;

public class PermutationTest_9_5 {
	@Test
	public void testPermute(){
		Permutation_9_5 per = new Permutation_9_5();
		List<String> list = per.permute("abcd");
		System.out.println(list);
	}
}
