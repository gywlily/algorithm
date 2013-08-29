package com.cc150.recursion_dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combination_9_4 {
	
	/**
	 * @param arr
	 * @return
	 */
	public List<List<Integer>> doCombination(int[] arr){
		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		combinations.add(new ArrayList<Integer>());
		for(int value : arr){			
			List<List<Integer>> tempCombinations = new ArrayList<List<Integer>>();	
			//tempCombinations.addAll(combinations);
			for(List<Integer> list: combinations){
				//tempCombinations.add(new ArrayList<Integer>(list));
				list.add(value);
				tempCombinations.add(list);
			}
			combinations = tempCombinations;
		}
		return combinations;
	}
}
