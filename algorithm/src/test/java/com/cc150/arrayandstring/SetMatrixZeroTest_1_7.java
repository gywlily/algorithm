package com.cc150.arrayandstring;

import java.util.Arrays;

import org.junit.Test;

public class SetMatrixZeroTest_1_7 {
	@Test
	public void testSet(){
		SetMatrixZero_1_7 smz = new SetMatrixZero_1_7();
		//int[][] m = new int[][]{{1,2,3}, {0,9,7},{8,7,0}};
		int[][] m = new int[][]{{1,0,0}};
		smz.set(m);
		for(int[] a : m){
			System.out.println(Arrays.toString(a));
		}
	}
}
