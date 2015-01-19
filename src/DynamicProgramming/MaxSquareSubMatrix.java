package DynamicProgramming;

public class MaxSquareSubMatrix {

	public void subMatrix(int[][] arrA, int row, int cols) {
		int[][] sub = new int[row][cols];
		// copy the first row
		for (int i = 0; i < cols; i++) {
			sub[0][i] = arrA[0][i];
		}
		// copy the first column
		for (int i = 0; i < row; i++) {
			sub[i][0] = arrA[i][0];
		}
		
		// for rest of the matrix
		// check if arrA[i][j]==1
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < cols; j++) {
				if (arrA[i][j] == 1) {
					sub[i][j] = Math.min(sub[i - 1][j - 1],
							Math.min(sub[i][j - 1], sub[i - 1][j])) + 1;
				} else {
					sub[i][j] = 0;
				}
			}
		}
		display(sub, row, cols);
		// find the maximum size of sub matrix and location
		int x = 0;
		int y = 0;
		int maxSize = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (sub[i][j] > maxSize) {
					maxSize = sub[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("Matrix Size: " + maxSize);
		for(int i = x-maxSize+1;i<=x;i++){
			for(int j = x-maxSize+1;j<=x;j++){
				System.out.print(arrA[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void display(int[][] a, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arrA = { { 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
				{ 1, 1, 1, 1, 1, 1 } };
		MaxSquareSubMatrix i = new MaxSquareSubMatrix();
		i.subMatrix(arrA, 5, 6);

	}
}
