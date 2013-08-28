package com.cc150.recursion_dp;

import java.util.Map;

public class RobotMove_9_2 {
	public int move(int row, int col, int r, int c, Map<String, Integer> cache){
		if(row == r && col == c)
			return 1;
		if(r > row || c > col) return 0;
		String curKey = r + "," + c;
		if(cache.containsKey(curKey))
			return cache.get(curKey);
		int count = move(row, col, r + 1, c, cache) + move(row, col, r, c + 1, cache);
		cache.put(curKey, count);
		return count;
	}
}
