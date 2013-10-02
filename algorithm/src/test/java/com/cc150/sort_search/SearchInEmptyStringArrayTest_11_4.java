package com.cc150.sort_search;

import junit.framework.Assert;

import org.junit.Test;

public class SearchInEmptyStringArrayTest_11_4 {
	@Test
	public void testSeachString(){
		SearchInEmptyStringArray_11_4 sies = new SearchInEmptyStringArray_11_4();
		int actual = sies.searchString(new String[]{"at", "", "", "", "ball", "", "", "car", 
				"", "", "dad", "", ""}, "ball");
		Assert.assertEquals(4, actual);
	}
}
