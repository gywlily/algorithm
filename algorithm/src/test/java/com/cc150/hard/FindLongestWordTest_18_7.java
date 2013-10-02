package com.cc150.hard;

import junit.framework.Assert;

import org.junit.Test;

public class FindLongestWordTest_18_7 {
	@Test
	public void testFind(){
		FindLongestWord_18_7 flw = new FindLongestWord_18_7();
		String actual = flw.find(new String[]{"cat", "banana", "dog", "nana", "bananawalker", "walk", "walker", "dogwalker"});
		Assert.assertEquals("bananawalker", actual);
	}
	
}
