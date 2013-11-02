package com.jobsecond;

import java.util.HashSet;

public class LongestConsecutiveLength_2 {
	public int get(int[] arr){
		if(arr == null || arr.length == 0)
			return 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: arr)
			set.add(i);
		int sum = 0;
		for(int i : arr){
			int count = 1;
			if(set.contains(i)){
				int v = i - 1;
				while(set.contains(v)){
					count++;
					set.remove(v);
					v--;
				}
				v = i + 1;
				while(set.contains(v)){
					count++;
					set.remove(v);
					v++;
				}
				if(sum < count) sum = count;
			}
		}
		return sum;
	}
}
