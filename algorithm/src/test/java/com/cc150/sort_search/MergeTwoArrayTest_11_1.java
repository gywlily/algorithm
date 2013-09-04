package com.cc150.sort_search;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoArrayTest_11_1 {
	@Test
	public void testMerge(){
		MergeTwoArray_11_1 mta = new MergeTwoArray_11_1();
		int[] arr1 = new int[10];
		Arrays.fill(arr1, '\0');
		arr1[0] = 4;
		arr1[1] = 7;
		arr1[2] = 9;
		mta.merge(arr1, new int[]{3,8});
		System.out.println(Arrays.toString(arr1));
	}
}
