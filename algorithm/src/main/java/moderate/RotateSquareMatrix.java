package moderate;

public class RotateSquareMatrix {
	public void rotate(int[][] arr){
		rotate(arr, 0, arr.length-1, 0, arr[0].length - 1);
	}
	
	public void rotate(int[][] arr, int row1, int row2, int col1, int col2){
		if(row1 >= row2 || col1 >= col2)
			return;
		int len = arr.length;
		for(int i = col1; i < col2; i++){
			int var = arr[row1][i];
			arr[row1][i] = arr[len - i - 1][col1];
			arr[len - i - 1][col1] = arr[row2][len - i - 1];
			arr[row2][len - i - 1] = arr[i][col2];
			arr[i][col2] = var;
		}
		row1++;
		row2--;
		col1++;
		col2--;
		rotate(arr, row1, row2, col1, col2);
	}
}
