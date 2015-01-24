package WeekendSpecial;

public class MountainPoints {
	// Given a M * N matrix, if the element in thematrix is larger than other 8
	// elements who stay around it, then named thatelement be mountain point.
	// Print all the mountain points.

	public void print(int[][] A) {
		for (int i = 1; i < A.length - 1; i++) {
			for (int j = 1; j < A[0].length - 1; j++) {
				if (A[i][j] > A[i - 1][j - 1] && A[i][j] > A[i][j - 1]
						&& A[i][j] > A[i - 1][j] && A[i][j] > A[i][j + 1]
						&& A[i][j] > A[i + 1][j] && A[i][j] > A[i + 1][j + 1]
						&& A[i][j] > A[i - 1][j + 1]
						&& A[i][j] > A[i + 1][j - 1]) {
					System.out.println(A[i][j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 2, 3, 1, 6 },
				{ 1, 1, 1, 1 } };
		MountainPoints m = new MountainPoints();
		m.print(A);

	}

}
