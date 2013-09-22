package com.cc150.recursion_dp;

import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;

import com.cc150.recursion_dp.RobotMove_9_2;

public class RobotMoveTest_9_2 {
	@Test
	public void testMove(){
		RobotMove_9_2 rm = new RobotMove_9_2();
		int actValue = rm.move(2, 2, 0, 0, new HashMap<String, Integer>());
		Assert.assertEquals(6, actValue);
	}
}
