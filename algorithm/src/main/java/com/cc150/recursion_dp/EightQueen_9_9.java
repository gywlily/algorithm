package com.cc150.recursion_dp;

import java.util.Arrays;

public class EightQueen_9_9 {
	public void doQueen(int[] board, int index){
		if(index == 8){
			System.out.println(Arrays.toString(board));
			return;
		}
		for(int i = 0; i < 8; i++){
			board[index] = i;
			if(isValid(board, index)){
				doQueen(board, index+1);
			}
		}
	}
	
	private boolean isValid(int[] board, int index){
		for(int i = 0; i < index; i++){
			if(Math.abs(board[i] - i) == Math.abs(board[index] - index))
				return false;
			if(board[index] == board[i])
				return false;
		}
		return true;
	}
}
