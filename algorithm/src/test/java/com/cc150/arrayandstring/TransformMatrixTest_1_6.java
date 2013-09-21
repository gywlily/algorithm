package com.cc150.arrayandstring;

import java.util.Arrays;

import org.junit.Test;

public class TransformMatrixTest_1_6 {
	@Test
	public void testTransformMatrix(){
		int[][] m = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		//int[][] m = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
		TransformMatrix_1_6 tm = new TransformMatrix_1_6();
		tm.transformMatrix(m);
		for(int[] a : m){
			System.out.println(Arrays.toString(a));
		}
	}
}
