package Array;

public class MissingDuplicate {
	// naive solution is use Hash Table ..space complexity - O(n)
	// better solutiion - XOR
	// A^A = 0 and A^B^A = B, so if we XOR all the elements, answer will be the
	// missing no
	public int find(int[] A) {
		int miss = A[0]; // if we have only one element, the missing no will be
							// that no
		for (int i = 1; i < A.length; i++) {
			miss = miss ^ A[i];
		}
		return miss;
	}

	public static void main(String[] args) {
		int[] A = { 2, 1, 3, 5, 5, 3, 2, 1, 6, 7, 7, 8, 8 };
		MissingDuplicate i = new MissingDuplicate();
		System.out.println("Missing duplicate is " + i.find(A));

	}

}
