package com.cc150.hard;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ChangeWordByCharTest_18_10 {
	@Test
	public void testChange(){
		ChangeWordByChar_18_10 cwb = new ChangeWordByChar_18_10();
		Set<String> dic = new HashSet<String>();
		dic.add("damp");
		dic.add("lamp");
		dic.add("limp");
		dic.add("lime");
		dic.add("like");
		cwb.change("damp", "like", dic);
	}
}
