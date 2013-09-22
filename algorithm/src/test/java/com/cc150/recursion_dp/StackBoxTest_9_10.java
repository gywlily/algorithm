package com.cc150.recursion_dp;

import java.util.ArrayList;

import org.junit.Test;

import com.cc150.recursion_dp.StackBox_9_10;


public class StackBoxTest_9_10 {
	@Test
	public void testGetLongestStack(){
		StackBox_9_10 sb = new StackBox_9_10();
		StackBox_9_10.Box[] boxes = new StackBox_9_10.Box[5];
		boxes[0] = sb.new Box(10, 3, 6);
		boxes[1] = sb.new Box(5, 6, 2);
		boxes[2] = sb.new Box(15, 1, 9);
		boxes[3] = sb.new Box(2, 5, 10);
		boxes[4] = sb.new Box(6, 8, 3);
		
		sb.getLongestStack(boxes, new ArrayList<StackBox_9_10.Box>());
	}
}	
