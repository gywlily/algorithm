package com.cc150.hard;

import java.util.Random;

public class ShuffleCard_18_2 {
	public void shuffle(int[] cards){
		if(cards.length != 52)
			return;
		Random rand = new Random();
		for(int i = 1; i < cards.length; i++){
			int index = rand.nextInt(i + 1);
			if(index != i)
				swap(cards, i, index);
		}
	}
	private void swap(int[] arr, int i, int j){
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
