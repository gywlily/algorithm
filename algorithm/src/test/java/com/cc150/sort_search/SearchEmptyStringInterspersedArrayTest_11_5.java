package com.cc150.sort_search;

import junit.framework.Assert;

import org.junit.Test;

public class SearchEmptyStringInterspersedArrayTest_11_5 {
	@Test
	public void testSearch(){
		SearchEmptyStringInterspersedArray_11_5 sss = new SearchEmptyStringInterspersedArray_11_5();
		String[] arr = new String[]{"at", "", "", "", "ball", "", "", "car", "", "","dad", "", "dpt"};
		int n = sss.search(arr , "at");
		Assert.assertEquals(0, n);
		
		n = sss.search(arr , "ball");
		Assert.assertEquals(4, n);
		
		n = sss.search(arr , "car");
		Assert.assertEquals(7, n);
		
		n = sss.search(arr , "dad");
		Assert.assertEquals(10, n);
		
		n = sss.search(arr , "dpt");
		Assert.assertEquals(12, n);
		
		n = sss.search(arr , "aaa");
		Assert.assertEquals(Integer.MIN_VALUE, n);
	}
}
