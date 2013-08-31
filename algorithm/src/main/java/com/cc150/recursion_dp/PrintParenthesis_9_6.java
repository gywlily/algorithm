package com.cc150.recursion_dp;

import java.util.ArrayList;

public class PrintParenthesis_9_6 {
	public void print(int left, int right, String str, ArrayList<String> list){
		if(left == right && left == 0){
			list.add(str);
			return;
		}
		if(left > 0)
			print(left - 1, right, str + "(", list);
		if(right > 0 && right > left)
			print(left, right - 1, str + ")", list);
	}
}
