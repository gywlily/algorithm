package com.cc150.moderate;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PrimeFinderTest {
	@Test
	@Ignore
	public void testFind(){
		PrimeFinder pf = new PrimeFinder();
		List<Integer> result = pf.find(23);
		Integer[] expected = new Integer[]{2,3,5,7,11,13,17,19,23};
		Assert.assertEquals(result.size(), expected.length);
		Assert.assertArrayEquals(expected, result.toArray(new Integer[0]));		
	}
	
	@Test 
	public void testGet(){
		PrimeFinder pf = new PrimeFinder();
		System.out.println(pf.getNumberOfPrimes(1000000));
	}
}
