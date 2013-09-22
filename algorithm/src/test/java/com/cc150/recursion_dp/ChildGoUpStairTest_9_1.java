package com.cc150.recursion_dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Ignore;

import com.cc150.recursion_dp.ChildGoUpStair_9_1;

public class ChildGoUpStairTest_9_1 {
	@Test
	@Ignore
	public void testGetStep(){
		System.out.println("normal");
		ChildGoUpStair_9_1 cgus = new ChildGoUpStair_9_1();
		long begin = System.currentTimeMillis();
		int value = cgus.getStep(20, "");
		System.out.println((System.currentTimeMillis() - begin) / 1000);
		System.out.println(value);
		//Assert.assertEquals(7, value);
	}
	
	@Test
	public void testGetStepDP(){
		System.out.println("DP");
		ChildGoUpStair_9_1 cgus = new ChildGoUpStair_9_1();
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		long begin = System.currentTimeMillis();
		long value = cgus.getStepDP(80, map);
		System.out.println((System.currentTimeMillis() - begin) / 1000);
		System.out.println(value);
	}
	
	@Test
	public void testGetStepDPOptimized(){
		System.out.println("DP Optimized");
		ChildGoUpStair_9_1 cgus = new ChildGoUpStair_9_1();
		long begin = System.currentTimeMillis();
		int n = 80;
		long[] cache = new long[n];
		Arrays.fill(cache, -1);
		long value = cgus.getStepDPOptimized(n, new ArrayList<String>(), "", cache);
		System.out.println((System.currentTimeMillis() - begin) / 1000);
		System.out.println(value);
	}
}
