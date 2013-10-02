package com.cc150.moderate;

import junit.framework.Assert;

import org.junit.Test;

public class CountTrailingZerosTest_17_3 {
	@Test
	public void testCount(){
		CountTrailingZeros_17_3 ctz = new CountTrailingZeros_17_3();
		int actual = ctz.count(16);
		Assert.assertEquals(3, actual);
	}
}
