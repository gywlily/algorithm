package com.cc150.recursion_dp;

import java.util.List;
import java.util.Map;

public class ChildGoUpStair_9_1 {
	// normal version
	public int getStep(int n, String s){
		if(n == 0){
			//System.out.println(s);			
			return 1;
		}
		int count = 0;
		if(n >= 1)
			count = getStep(n - 1, s + "1,");
		if(n >= 2)
			count += getStep(n - 2, s + "2,");
		if(n >= 3)
			count += getStep(n - 3, s + "3,");
		return count;
	}
	
	
	/*
	 *  dynamic version
	 *  @param n number of stairs
	 *  @param map for cache intermedia result
	 */
	public long getStepDP(int n, Map<Integer, Long> map){
		if(n == 0)
			return 1;
		if(map.containsKey(n))
			return map.get(n);
		
		long count = 0;
		if(n >= 1)
			if(map.containsKey(n - 1))
				count = map.get(n - 1);
			else
				count = getStepDP(n - 1, map);
		if(n >= 2)
			if(map.containsKey(n - 2))
				count += map.get(n - 2);
			else
				count += getStepDP(n - 2, map);
		if(n >= 3)
			if(map.containsKey(n - 3))
				count += map.get(n - 3);
			else
				count += getStepDP(n - 3, map);	
		map.put(n, count);
		return count;
	}
	
	public long getStepDPOptimized(int n, List<String> list, String step, long[] cache){
		if(n == 0){
			list.add(step);
			return 1;
		}
		if(cache[n - 1] >= 0) return cache[n - 1];
		long a = 0, b = 0, c = 0;
		if(n >= 1)
			a = getStepDPOptimized(n - 1, list, step + ",1", cache);
		if(n >= 2)
			b = getStepDPOptimized(n - 2, list, step + ",2", cache);
		if(n >= 3)
			c = getStepDPOptimized(n - 3, list, step + ",3", cache);
		cache[n - 1] = a + b + c;
		return cache[n - 1];
	}
}
