package com.jobsecond;

import junit.framework.Assert;

import org.junit.Test;

public class RegularExpressionSpportStarAndDotTest_1 {
	@Test
	public void testMatchFalse(){
		RegularExpressionSpportStarAndDot_1 r = new RegularExpressionSpportStarAndDot_1();
		boolean act;
		act = r.match("aa", "bb");
		Assert.assertFalse(act);
		
		act = r.match("abbcdc", "a*cd");
		Assert.assertFalse(act);
	}
	
	@Test
	public void testMatchTrue(){
		RegularExpressionSpportStarAndDot_1 r = new RegularExpressionSpportStarAndDot_1();
		boolean act ;
		act = r.match("abbcdc", "a*c");
		Assert.assertTrue(act);
		
		act = r.match("abbcdc", "a*c****d*");
		Assert.assertTrue(act);
		
		act = r.match("adbbcdc", "a*c****d*");
		Assert.assertTrue(act);
	}
}
