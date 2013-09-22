package com.cc150.recursion_dp;

import org.junit.Test;

import com.cc150.recursion_dp.EightQueen_9_9;

public class EightQueenTest_9_9 {
	@Test
	public void testDoQueen(){
		int[] board = new int[8];
		EightQueen_9_9 q = new EightQueen_9_9();
		q.doQueen(board, 0);
	}
}
