package WeekendSpecial;

public class AllSubSetOfSizeK {

	public void subset(int[] A, int k, int start, int currLen, boolean[] used) {

		if (currLen == k) {
			for (int i = 0; i < A.length; i++) {
				if (used[i] == true) {
					System.out.print(A[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		if (start == A.length) {
			return;
		}
		// For every index we have two options,
		// 1.. Either we select it, means put true in used[] and make currLen+1
		used[start] = true;
		subset(A, k, start + 1, currLen + 1, used);
		// 2.. OR we dont select it, means put false in used[] and dont increase
		// currLen
		used[start] = false;
		subset(A, k, start + 1, currLen, used);
	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		boolean[] B = new boolean[A.length];
		AllSubSetOfSizeK i = new AllSubSetOfSizeK();
		i.subset(A, 3, 0, 0, B);

	}

}
