package com.cc150.arrayandstring;

public class StringCompress_1_5 {
	public String stringCompress(String str){
		if(str == null || str.length() == 0) return str;
		char ch = str.charAt(0); 
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == ch)
				count++;
			else{
				sb.append(ch).append(count);
				ch = str.charAt(i);
				count = 1;
			}
			// 当数到最后一个字符时
			if(i == str.length() - 1)
				sb.append(ch).append(count);
		}
		return sb.length() < str.length() ? sb.toString() : str;
	}
}
