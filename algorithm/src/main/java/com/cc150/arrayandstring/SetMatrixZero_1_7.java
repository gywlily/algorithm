package com.cc150.arrayandstring;

import java.util.Arrays;

public class SetMatrixZero_1_7 {
	public void set(int[][] matrix) {
		if (matrix == null)
			return;

		int[] rows = new int[matrix.length];
		int[] cols = new int[matrix[0].length];
		Arrays.fill(rows, -1);
		Arrays.fill(cols, -1);
		for (int r = 0; r < rows.length; r++)
			for (int c = 0; c < cols.length; c++)
				if (matrix[r][c] == 0) {
					rows[r] = 0;
					cols[c] = 0;
				}
		for (int r = 0; r < rows.length; r++)
			for (int c = 0; c < cols.length; c++)
				if (rows[r] == 0 || cols[c] == 0)
					matrix[r][c] = 0;
	}
}
