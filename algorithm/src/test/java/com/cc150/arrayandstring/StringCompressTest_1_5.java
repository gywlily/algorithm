package com.cc150.arrayandstring;

import junit.framework.Assert;

import org.junit.Test;

public class StringCompressTest_1_5 {
	@Test
	public void testStringCompress(){
		StringCompress_1_5 sc = new StringCompress_1_5();
		String str = sc.stringCompress(null);
		Assert.assertNull(str);
		str = sc.stringCompress("");
		Assert.assertEquals("", str);
		str = sc.stringCompress("abbc");
		Assert.assertEquals("abbc", str);
		str = sc.stringCompress("abbbbcccd");
		Assert.assertEquals("a1b4c3d1", str);
	}
}
