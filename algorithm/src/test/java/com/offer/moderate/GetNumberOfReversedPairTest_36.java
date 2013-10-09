package com.offer.moderate;

import junit.framework.Assert;

import org.junit.Test;

public class GetNumberOfReversedPairTest_36 {
	@Test
	public void testGet(){
		GetNumberOfReversedPair_36 g = new GetNumberOfReversedPair_36();
		int actual = g.get(new int[]{7,5,6,4});
		Assert.assertEquals(5, actual);
	}
}
