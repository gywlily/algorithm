package com.cc150.hard;

import java.util.Arrays;

import org.junit.Test;

public class ShuffleCardTest_18_2 {
	@Test
	public void testShuffle(){
		int[] arr = new int[52];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		System.out.println(Arrays.toString(arr));
		ShuffleCard_18_2 sc = new ShuffleCard_18_2();
		sc.shuffle(arr);
		System.out.println(Arrays.toString(arr));
	}
}
