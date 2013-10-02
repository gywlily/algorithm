package com.cc150.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class FindLongestWord_18_7 {
	public String find(String[] words){
		Arrays.sort(words, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				 return s1.length() >= s2.length() ? -1 : 1;
//				if(s1.length() == s2.length()) return 0;
//				else if(s1.length() > s2.length()) return 1;
//				else return -1;
			}
		});
		//TreeMap<String, Integer> dic = new TreeMap<String, Integer>();
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		for(int i = 0; i < words.length; i++)
			dic.put(words[i], i);
		for(String word : words){
			if(wordExist(word, dic))
				return word;
		}
		
		return "";
	}
	
	private boolean wordExist(String word, HashMap<String, Integer> dic){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < word.length() - 1; i++){
			sb.append(word.substring(i, i+1));
			if(dic.containsKey(sb.toString())){
				if(dic.containsKey(word.substring(i + 1)))
					return true;
				boolean ret = wordExist(word.substring(i + 1), dic);
				if(ret) return ret;
			}
		}
		return false;
	}
}
