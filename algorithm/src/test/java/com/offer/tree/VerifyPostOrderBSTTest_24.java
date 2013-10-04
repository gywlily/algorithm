package com.offer.tree;

import junit.framework.Assert;

import org.junit.Test;

public class VerifyPostOrderBSTTest_24 {
	@Test
	public void testVerify(){
		VerifyPostOrderBST_24 vp = new VerifyPostOrderBST_24();
		boolean actual = vp.verify(new int[]{5,7,6,9,11,10,8});
		Assert.assertTrue(actual);
		actual = vp.verify(new int[]{7,4,6,5});
		Assert.assertFalse(actual);
	}
}
