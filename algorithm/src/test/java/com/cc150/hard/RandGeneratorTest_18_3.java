package com.cc150.hard;

import java.util.Arrays;

import org.junit.Test;

public class RandGeneratorTest_18_3 {
	@Test
	public void testGenerate(){
		RandGenerator_18_3 rg = new RandGenerator_18_3();
		int[] actual = rg.generate(new int[]{1,2,3,4,5,6,7,8,9}, 5);
		System.out.println(Arrays.toString(actual));
	}
}
