package com.cc150.stackandqueue;

import java.util.LinkedList;

import org.junit.Test;

public class SortStackTest_3_2 {
	@Test
	public void testSort(){
		SortStack_3_2 ss = new SortStack_3_2();
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(9);
		list.add(1);
		list.add(5);
		LinkedList<Integer> actList = ss.sort(list);
		System.out.print(actList);
		
		
	}
}
