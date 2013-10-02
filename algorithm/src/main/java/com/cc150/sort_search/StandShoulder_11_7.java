package com.cc150.sort_search;

import java.util.Arrays;
import java.util.Comparator;

public class StandShoulder_11_7 {
	public int standShoulder(Person[] persons){
		Arrays.sort(persons, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2){
				return p1.height < p2.height ? -1 : p1.height == p2.height ? 0 :1;
			}
		});
		int[] counts = new int[persons.length];
		int max = 0;
		counts[0] = 1;
		for(int i = 1; i < counts.length; i++){
			for(int j = i - 1; j >= 0; j--){
				if(persons[i].weight > persons[j].weight)
					counts[i] = counts[j] + 1 > counts[i] ? counts[j] + 1 : counts[i];
			}
			if(counts[i] > max)
				max = counts[i];
		}
		return max;
	}
}
