package com.cc150.sort_search;

import junit.framework.Assert;

import org.junit.Test;

public class StandShoulderTest_11_7 {
	@Test
	public void testStandShoulder(){
		StandShoulder_11_7 ss = new StandShoulder_11_7();
		int actual = ss.standShoulder(new Person[]{
				new Person(65,100), new Person(70,150), new Person(56,90),
				new Person(50,190), new Person(60,95), new Person(68, 110)
		});
		Assert.assertEquals(5, actual);
	}
}
