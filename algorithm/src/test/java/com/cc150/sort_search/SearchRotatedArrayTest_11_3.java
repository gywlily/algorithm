package com.cc150.sort_search;

import junit.framework.Assert;

import org.junit.Test;

public class SearchRotatedArrayTest_11_3 {
	@Test
	public void testSearch(){
		SearchRotatedArray_11_3 sr = new SearchRotatedArray_11_3();		
		int i = sr.search(new int[]{15,16,19,20,25,1,3,4,5,7,10,14}, 5);
		Assert.assertEquals(8, i);
		
		i = sr.search(new int[]{1,3,4,5,7,10,14, 15,16,19,20,25}, 5);
		Assert.assertEquals(3, i);
		
		i = sr.search(new int[]{7,10,14, 15,16,19,20,25, 1,3,4,5}, 5);
		Assert.assertEquals(11, i);
		
		i = sr.search(new int[]{7,10,14, 15,16,19,20,25, 1,3,4,5}, 89);
		Assert.assertEquals(Integer.MIN_VALUE, i);
	}
	
	@Test
	public void testSearchRotatedArray(){
		SearchRotatedArray_11_3 sr = new SearchRotatedArray_11_3();		
		int i = sr.searchRotate(new int[]{15,16,19,20,25,1,3,4,5,7,10,14}, 5);
		Assert.assertEquals(8, i);
		
		i = sr.searchRotate(new int[]{1,3,4,5,7,10,14, 15,16,19,20,25}, 5);
		Assert.assertEquals(3, i);
		
		i = sr.searchRotate(new int[]{7,10,14, 15,16,19,20,25, 1,3,4,5}, 5);
		Assert.assertEquals(11, i);
		
		i = sr.searchRotate(new int[]{7,10,14, 15,16,19,20,25, 1,3,4,5}, 89);
		Assert.assertEquals(-1, i);
	}
}
