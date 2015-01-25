package WeekendSpecial;

import java.util.Arrays;

public class SaddlePoints {

	// write a program in c# or java or c that prints saddle points in a N by N
	// Matrix. //
	// saddle point is nothing but a cell values which has greater value among
	// all the cell values in that row as well as it should be the smallest
	// value among the column in which it is found......???

	// Step 1: Find maximum in each row
	// Step 2: Find minimum in each column
	// Step 3: Find common element in outputs of step 1 and step 2, the common
	// element is the saddle point.

	public void Saddle(int[][] A) {
		int maxRow[] = new int[A.length];
		int minCol[] = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			maxRow[i] = A[i][0];
			for (int j = 1; j < A.length; j++) {
				if (A[i][j] > maxRow[i]) {
					maxRow[i] = A[i][j];
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			minCol[i] = A[0][i];
			for (int j = 1; j < A.length; j++) {
				if (A[j][i] < minCol[i]) {
					minCol[i] = A[j][i];
				}
			}
		}
		
		// find the common points, saddle
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (minCol[i] == maxRow[j]) {
					System.out.println(minCol[i] + " ");
				}
			}
		}
		

	}

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SaddlePoints s = new SaddlePoints();
		s.Saddle(A);

	}

}
