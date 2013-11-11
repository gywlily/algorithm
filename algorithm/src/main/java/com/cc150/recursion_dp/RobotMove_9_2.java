package com.cc150.recursion_dp;

import java.util.Arrays;
import java.util.Map;

public class RobotMove_9_2 {
	public int move(int row, int col, int r, int c, Map<String, Integer> cache){
		if(row == r + 1 && col == c + 1)
			return 1;
		if(r + 1 > row || c + 1> col) return 0;
		String curKey = r + "," + c;
		if(cache.containsKey(curKey))
			return cache.get(curKey);
		int count = move(row, col, r + 1, c, cache) + move(row, col, r, c + 1, cache);
		cache.put(curKey, count);
		return count;
	}
	
	// 使用数组
	public void move_1(int[][] grid){
		int row = grid.length;
		int col = grid[0].length;
		Arrays.fill(grid[row - 1], 1);
		for(int r = 0; r < row - 1; r++)
			grid[r][col-1] = 1;
		for(int r = row - 2; r >= 0; r--)
			for(int c = col - 2; c >= 0; c--)
				grid[r][c] = grid[r+1][c] + grid[r][c+1];
	}
}
