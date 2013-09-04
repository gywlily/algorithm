package com.cc150.sort_search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramSort_11_2 {
	public static void main(String[] args){
		System.out.println("aaaaaaaa");
	}
	
	public void sort(String[] arr){
		Map<String, HashMap<String, Integer>> resultSet = 
				new HashMap<String, HashMap<String, Integer>>();
		for(String word :  arr){
			String key = getAnagram(word);
			HashMap<String, Integer> list = resultSet.get(key);
			if(list == null)
				list = new HashMap<String, Integer>();
			int n = list.get(word) != null ? list.get(word) : 0;
			list.put(word, n+1);
			resultSet.put(key, list);
		}
		int index = 0;
		for(String key : resultSet.keySet()){
			HashMap<String, Integer> wordList = resultSet.get(key);
			for(String word : wordList.keySet()){
				int n = wordList.get(word);
				for(int i = 0; i < n; i++)
					arr[index++] = word;
			}
		}
	}
	
	private String getAnagram(String word){
		char[] arr = word.toCharArray();
		Arrays.sort(arr);
		return String.valueOf(arr);
	}
}
