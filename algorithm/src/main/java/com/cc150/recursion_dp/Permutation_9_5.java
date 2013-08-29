package com.cc150.recursion_dp;

import java.util.ArrayList;
import java.util.List;

public class Permutation_9_5 {
	public List<String> permute(String str){
		char[] chs = str.toCharArray();
		List<String> resultList = new ArrayList<String>();		
		resultList.add(String.valueOf(chs[0]));
		for(int i = 1; i < chs.length; i++){
			List<String> tempList = new ArrayList<String>();
			for(String item: resultList){
				for(int j = 0; j <= item.length(); j++){
					if(j == item.length())
						tempList.add(item + chs[i]);
					else
						tempList.add(item.substring(0, j) + chs[i] + item.substring(j));					
				}				
			}
			resultList = tempList;
		}
		return resultList;
	}
}
