package com.jobsecond;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Larry
 *
 * ex.   original str: "abbcdc"
 *       regular expr: "a*c"
 *
 */

public class RegularExpressionSpportStarAndDot_1 {
	public boolean match(String orig, String re){
		return match(orig, re, createDic(orig));
	}
	
	private HashMap<Character, ArrayList<Integer>> createDic(String str){
		HashMap<Character, ArrayList<Integer>> dic = new HashMap<Character, ArrayList<Integer>>();
		for(int i = 0; i < str.length(); i++){
			ArrayList<Integer> list = null;
			Character ch = str.charAt(i);
			if(!dic.containsKey(ch))
				list = new ArrayList<Integer>();
			else
				list = dic.get(ch);
			list.add(i);
			dic.put(ch, list);
		}
		
		
		return dic;
	}
	
	private boolean match(String orig, String re, HashMap<Character, ArrayList<Integer>> dic){
		if(orig.length() == 0 && re.length() == 0)
			return true;
		if(orig.length() == 0 || re.length() == 0)
			return false;		
		for(int i = 0; i < re.length(); i++){
			if(re.charAt(i) == '*'){ // 单独处理*，因为*可以抵消0个或多个字符
				if(re.length() == i+1) // 如果*是正则表达式中的最后一个字符，则无论如何原始字符串有什么字符都能匹配
					return true;
				Character nextReChar = re.charAt(i+1);
				if(nextReChar == '*')
					continue;
				ArrayList<Integer> idxListOfNextChar = dic.get(nextReChar);
				for(int idx : idxListOfNextChar){
					boolean isMatch = match(orig.substring(idx + 1), re.substring(i + 2));
					//boolean isMatch = match(orig.substring(idx + 1), re.substring(i + 2), dic);
					if(isMatch) return true;
				}
				return false;
			} else { //
				if(re.charAt(i) != '.'){
					if(re.charAt(i) != orig.charAt(i))
						return false;
				} else{ // if 当前字符是。，则无需任何处理
					
				}
			}
		}		
		// 如果原始字符串和regular expression的字符串中的每个字符都验证相等，还需要检测是否长度相等，以防止一下情况
		// 原始字符串：                                                 "adcdfeg"     
		// regular expression:   "adcd"
		
		return re.length() == orig.length();
	}
}
