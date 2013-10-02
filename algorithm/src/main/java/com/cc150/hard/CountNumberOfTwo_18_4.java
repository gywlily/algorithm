package com.cc150.hard;

public class CountNumberOfTwo_18_4 {
	public int count(int n){
		int left = n, cur, right = 0, prop = 1, count = 0;
		while(left > 0){
			cur = left - left / 10 * 10;
			left /= 10;
			if(cur < 2)
				count += left * prop;
			else if(cur == 2)
				count += left * prop + (right + 1);
			else // cur > 2
				count += (left + 1) * prop;
			right = cur * prop + right;
			prop *= 10;
		}
		
		return count;
	}
}
