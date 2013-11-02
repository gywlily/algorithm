package com.cc150.moderate;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder {
	// 找出所有的小于n的质数
	public static int getNumberOfPrimes(int n) {
	    if(n <= 0) return 0;
	    int count = 0;
	    boolean[] arr = new boolean[n + 1];
	    Arrays.fill(arr, true);
	    int prime = 2, max = (int)Math.sqrt(n);
	    while(true){
	        for(int i = 2; i * prime <= n; i++){
	    		arr[i * prime] = false;
	    	}
	        while(!arr[++prime] && prime <= max) ;
	        if(prime > max) break;
	    }
	    for(int i = 2; i < arr.length; i++)
	        if(arr[i]) count++;
    	return count;
    }
	
	public List<Integer> find(int n){
		List<Integer> list = new LinkedList<Integer>();
		if(n < 2)
			return list;
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		int prime = 2;
		arr[0] = false; arr[1] = false; arr[2] = true;
		while(true){
			// set all numbers times of "prime" as false (not prime)
			for(int i = prime + 1; i <= n; i++)
				if(i % prime == 0)
					arr[i] = false;
			// find the next prime
			prime++;
			while(prime < n && !arr[prime])prime++;
			if(prime >= n)
				break;
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i])
				list.add(i);
		}
		return list;
	}
	
	
}
