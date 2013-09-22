/**
 * 
 */
package com.cc150.recursion_dp;

import junit.framework.Assert;

import org.junit.Test;

import com.cc150.recursion_dp.MagicIndex_9_3;

/**
 * @author Larry
 *
 */
public class MagicIndexTest_9_3 {
	/**
	 * 
	 */
	@Test
	public void testGet_notExist(){
		MagicIndex_9_3 mi = new MagicIndex_9_3();
		int[] arr = new int[]{-40,-20,-1,1,2,3,5,8,9,12,13};
		int actValue = mi.get(arr, 0, arr.length -1);
		Assert.assertEquals(-1, actValue);
	}
	
	@Test
	public void testGet_Exist(){
		MagicIndex_9_3 mi = new MagicIndex_9_3();
		int[] arr = new int[]{-40,-20,-1,1,2,3,5,7,9,12,13};
		int actValue = mi.get(arr, 0, arr.length -1);
		Assert.assertEquals(7, actValue);
	}
}
