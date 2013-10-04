package com.offer.stackandqueue;

public class VerifyStackInOut {
	public boolean verify(int[] in, int[] out){
		if(in == null || out == null || in.length == 0 || in.length != out.length)
			return false;
		int left = 0;
		while(in[left] != out[0] && left < in.length) 
			left++;
		if(left == in.length) 
			return false;
		int right = left + 1; 
		left--;
		for(int i = 1; i < out.length; i++){
			if(left >= 0 && in[left] == out[i]) {
				left--;
				continue;
			}
			if(right < in.length && in[right] == out[i]){
				right++;
				continue;
			}
			return false;
		}
		return true;
	}
}	
