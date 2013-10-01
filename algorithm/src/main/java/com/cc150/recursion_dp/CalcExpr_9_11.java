package com.cc150.recursion_dp;

public class CalcExpr_9_11 {
	public int calc(String expr, boolean result){
		if(expr.length() == 1)
			return (expr.equals("1") == result) ? 1 : 0;
		int count = 0;
		for(int i = 0; i < expr.length() - 1; i += 2){
			int n1 = expr.charAt(i) - '0';
			int n2 = expr.charAt(i + 2) - '0';
			char op = expr.charAt(i + 1);
			int v = calc(n1, op, n2);
			String newExpr = expr.substring(0, i) + v + expr.substring(i + 3);
			count += calc(newExpr, result);
		}
		return count;
	}
	
	public int calc(int i, char op, int j){
		switch(op){
		case '&':
			return i & j;
		case '^':
			return i ^ j;
		default:
			return i | j;
		}
	}
}
