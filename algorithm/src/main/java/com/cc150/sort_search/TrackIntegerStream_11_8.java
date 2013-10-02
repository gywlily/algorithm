package com.cc150.sort_search;

import java.util.TreeMap;

public class TrackIntegerStream_11_8 {
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	public void doCalc(int[] arr, int n){
		for(int key : arr){
			int value = 0;
			if(map.containsKey(key))
				value = map.get(key);
			map.put(key, value + 1);
		}
		System.out.println(n + " : " + getRankOfNumbers(n));
	}
	
	private int getRankOfNumbers(int n){
		int count = 0;
		for(int key : map.navigableKeySet()){
			if(key > n)
				break;
			count += map.get(key);
		}
		return count-1;
	}
}
