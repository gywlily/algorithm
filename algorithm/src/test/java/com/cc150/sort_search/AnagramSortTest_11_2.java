package com.cc150.sort_search;

import java.util.Arrays;

import org.junit.Test;

public class AnagramSortTest_11_2 {
	@Test
	public void testSort(){
		AnagramSort_11_2 as = new AnagramSort_11_2();
		String[] arr = new String[]{"apt", "but", "boy", "tub", "tea", "tap", "yob", "ate", "eat", "tap"};
		as.sort(arr);
		System.out.print(Arrays.toString(arr));
	}
}