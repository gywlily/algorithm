package com.offer.tree;

import org.junit.Test;

public class RebuildBSTTest_6 {
	@Test
	public void testRebuild(){
		RebuildBST_6 rb = new RebuildBST_6();
		int[] arr1 = new int[]{1,2,4,7,3,5,6,8};
		int[] arr2 = new int[]{4,7,2,1,5,3,8,6};
		Node root = rb.rebuild(arr1, arr2);
		System.out.println(root.value);
	}
}
