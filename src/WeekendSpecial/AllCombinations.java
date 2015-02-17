package WeekendSpecial;

public class AllCombinations {

	static int[] B = { 1, 2, 3 };

	public void combinations(int[] A, int x) {
		if (x == A.length - 1) {
			A[x] = 0; // last digit, don't select it
			printArray(A); // print the set
			A[x] = 1; //// last digit, select it
			printArray(A);
			return;
		}
		A[x] = 0;   //either you will not select this digit
		combinations(A, x + 1);
		A[x] = 1;  //either you will select this digit
		combinations(A, x + 1);
	}

	public void printArray(int[] A) {
		boolean isNULL = true;
		System.out.print("{");
		for (int i = 0; i < B.length; i++) {
			if (A[i] == 1) {
				System.out.print(B[i] + "");
				isNULL = false;
			}
		}
		if (isNULL == false) {
			System.out.print("}");
			System.out.print("  ");
		}	

		if (isNULL) {
			System.out.print("Empty");
			System.out.print("} ");
		}
	}

	public static void main(String[] args) {
		AllCombinations a = new AllCombinations();
		int[] A = new int[B.length];
		a.combinations(A, 0);

	}

}
