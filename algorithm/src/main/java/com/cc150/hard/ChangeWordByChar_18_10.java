package com.cc150.hard;

import java.util.Set;

public class ChangeWordByChar_18_10 {
	public void change(String word1, String word2, Set<String> dic){
		int[] flags = new int[word1.length()];
		System.out.println(wordExist(word1.toCharArray(), word2.toCharArray(), dic, "", flags));
	}
	
	public boolean wordExist(char[] word1, char[] word2, Set<String> dic, String s, int[] flags){
		if(new String(word1).equalsIgnoreCase(new String(word2))){
			System.out.println(s);
			return true;
		}
		for(int i = 0; i < word1.length; i++){
			if(flags[i] != 0)
				continue;
			char ch = word1[i];
			word1[i] = word2[i];
			if(dic.contains(new String(word1))){
				flags[i] = 1;
				boolean exist = wordExist(word1, word2, dic, s + word2[i], flags);
				if(exist)
					return exist;
				flags[i] = 0;
			}
			word1[i] = ch;
		}
		return false;
	}
}
