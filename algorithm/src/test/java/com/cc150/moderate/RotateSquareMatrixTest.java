package com.cc150.moderate;

import org.junit.Assert;
import org.junit.Test;

import com.cc150.moderate.RotateSquareMatrix;

public class RotateSquareMatrixTest {
	@Test
	public void testRotate(){
		RotateSquareMatrix rsm = new RotateSquareMatrix();
		int[][] arr = new int[][]{
				{1,  2},
				{5,  6}
		};
		rsm.rotate(arr);
		Assert.assertArrayEquals(new int[]{5, 1}, arr[0]);
		Assert.assertArrayEquals(new int[]{6, 2}, arr[1]);
	}
}
