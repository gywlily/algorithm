package com.cc150.arrayandstring;

public class TransformMatrix_1_6 {
	public void transformMatrix(int[][] matrix){
		transformMatrix(matrix, 0, matrix.length - 1, 0, matrix.length - 1);
	}
	
	public void transformMatrix(int[][] matrix, int r1, int r2, int c1, int c2){
		if(r1 >= r2 || c1 >= c2) return;
		for(int r = r1; r < r2; r++){
			int temp = matrix[r][c2];
			matrix[r][c2] = matrix[r1][r];
			matrix[r1][r] = matrix[r2 - (r - r1)][c1];
			matrix[r2 - (r - r1)][c1] = matrix[r2][c2 - (r - r1)];
			matrix[r2][c2 - (r - r1)] = temp;
		}
		
		transformMatrix(matrix, r1 + 1, r2 - 1, c1 + 1, c2 - 1);
	}
}
