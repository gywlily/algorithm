package com.cc150.moderate;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cc150.moderate.PrimeFinder;

public class PrimeFinderTest {
	@Test
	public void testFind(){
		PrimeFinder pf = new PrimeFinder();
		List<Integer> result = pf.find(23);
		Integer[] expected = new Integer[]{2,3,5,7,11,13,17,19,23};
		Assert.assertEquals(result.size(), expected.length);
		Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));		
	}
}
