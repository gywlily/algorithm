package com.offer.moderate;

public class PrintAllSequentialSumToN_41 {
	public void print(int x){
		int n = 2;
		int a = 10;
		while(a > 1 && (2 * x - n * n + n) > 0){
			if((2 * x - n * n + n) % (2 * n) == 0){
				a = (2 * x - n * n + n) / (2 * n);
				for(int i = a; i < a + n; i++)
					System.out.print(i + ",");
				System.out.println();
			}			
			n++;
		}
	}
}
