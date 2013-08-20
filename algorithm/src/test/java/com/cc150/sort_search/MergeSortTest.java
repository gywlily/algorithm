package com.cc150.sort_search;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
	@Test
	public void testSort(){
		MergeSort msMergeSort = new MergeSort();
		int[] arr = new int[]{
			1,4,5,2,8,9	
		};
		msMergeSort.sort(arr);
		int[] expect = new int[]{
				1,2,4,5,8,9
		};
		Assert.assertArrayEquals(expect, arr);
	}
}
