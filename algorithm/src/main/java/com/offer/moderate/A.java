package com.offer.moderate;

public class A {
	public static void main(String[] args){
		test();
	}
	
	public static void test(){
		double[][] pProbabilities = new double[2][];
		int  g_maxValue = 6, number = 2;
	    pProbabilities[0] = new double[g_maxValue * number + 1];
	    pProbabilities[1] = new double[g_maxValue * number + 1];
	   
	    int flag = 0;
	    for (int i = 1; i <= g_maxValue; ++i)
	        pProbabilities[flag][i] = 1;
	      
	    for (int k = 2; k <= number; ++k)
	    {
	        for (int i = k; i <= g_maxValue * k; ++i)
	        {
	            pProbabilities[1 - flag][i] = 0;
	            for(int j = 1; j <= i && j <= g_maxValue; ++j)
	                pProbabilities[1 - flag][i] += pProbabilities[flag][i - j];
	        }
	 
	        flag = 1 - flag;
	    }
	 
	    double total = Math.pow((double)g_maxValue, number);
	    for(int i = number; i <= g_maxValue * number; ++i)
	    {
	        double ratio = pProbabilities[flag][i] / total;
	        System.out.println(i + ":\t" + ratio);
	    }
	}
}
