package com.cc150.recurson_dp;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import com.cc150.recursion_dp.ChildGoUpStair_9_1;

public class ChildGoUpStairTest_9_1 {
	@Test
	public void testGetStep(){
		System.out.println("normal");
		ChildGoUpStair_9_1 cgus = new ChildGoUpStair_9_1();
		long begin = System.currentTimeMillis();
		int value = cgus.getStep(30, "");
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
		System.out.print(value);
	}
}
