package DynamicProgramming;
//http://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/
public class CoinGame {

	public static int solve(int[] A) {
		int[][] solution = new int[A.length][A.length];

		for (int interval = 0; interval < A.length; interval++) {
			for (int i = 0, j = interval; j < A.length; i++, j++) {
				// a = fn(i+2,j) - user chooses i opponent chooses i+1
				// b = fn(i+1,j-1)- user chooses i , opponent chooses j OR
				// user chooses j , opponent chooses i
				// c = fn(i,j-2)- user chooses j , opponent chooses j-1
				int a, b, c;
				if (i + 2 <= j)
					a = solution[i + 2][j];
				else
					a = 0;
				if (i + 1 <= j - 1)
					b = solution[i + 1][j - 1];
				else
					b = 0;
				if (i <= j - 2)
					c = solution[i][j-2];
				else
					c = 0;

				solution[i][j] = Math
						.max(A[i] + Math.min(a, b), A[j]+ Math.min(b, c));
			}
		}
		return solution[0][A.length - 1];
	}

	public static void main(String[] args) {
		int[] A = { 20,30,2,2,2,10 };
		System.out.println(solve(A));
	}

}
