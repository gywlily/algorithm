package com.cc150.stackandqueue;

import java.util.LinkedList;

public class SortStack_3_2 {
	public LinkedList<Integer> sort(LinkedList<Integer> stk){
		if(stk == null || stk.isEmpty()) return stk;
		LinkedList<Integer> aStk = new LinkedList<Integer>();
		while(!stk.isEmpty()){
			int temp = stk.pop();
			while(!aStk.isEmpty() && temp < aStk.peek())
				stk.push(aStk.pop());
			aStk.push(temp);
		}
		return aStk;
	}
}
