package com.cc150.recursion_dp;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class RobotMoveTest_9_2 {
	int r = 10, c = 3;
	@Test
    //@Ignore
	public void testMove(){
		RobotMove_9_2 rm = new RobotMove_9_2();
		int actValue = rm.move(r, c, 0, 0, new HashMap<String, Integer>());
		// Assert.assertEquals(6, actValue);
		System.out.println("move: " + actValue);
	}
	
	@Test
	//@Ignore
	public void testMove_1(){
		RobotMove_9_2 rm = new RobotMove_9_2();
		int[][] grid = new int[r][c];
		rm.move_1(grid);
		System.out.println("move_1 : " + grid[0][0]);
	}
}
