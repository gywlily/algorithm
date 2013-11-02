package com.jobsecond;

import org.junit.Test;

public class LongestConsecutiveLengthTest_2 {
	@Test
	public void testGet(){
		LongestConsecutiveLength_2 l = new LongestConsecutiveLength_2();
		int actual = l.get(new int[]{2,5,10,4,9,6});
		System.out.println(actual);
	}
}
