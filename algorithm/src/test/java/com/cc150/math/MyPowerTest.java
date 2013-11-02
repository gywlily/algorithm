package com.cc150.math;
import org.junit.Assert;
import org.junit.Test;

import com.offer.math.MyPower;
public class MyPowerTest {
	@Test
	public void testCalc(){
		MyPower mp = new MyPower();
		int actual = mp.calc(0, 1);
		Assert.assertEquals(0, actual);
	}
}
