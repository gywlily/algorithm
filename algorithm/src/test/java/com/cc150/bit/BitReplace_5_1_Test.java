package com.cc150.bit;

import org.junit.Test;

public class BitReplace_5_1_Test {
	@Test
	public void testReplace(){
		BitReplace_5_1 bp = new BitReplace_5_1();
		long ret = bp.replace(1024, 19, 2, 6);
		System.out.print(ret);
	}
	
	
	
}
