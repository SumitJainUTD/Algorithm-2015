package Arrays_March;
//YES
import java.util.Arrays;

public class FixIndexes {
	public static int[] fix(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] != -1 && A[i] != i) {
				int x = A[i];
				while (A[x] != -1 && A[x] != x) { // check if desired place is
													// not vacate
					int y = A[x]; // store the value from desired place
					A[x] = x; // place the x to its correct position
					x = y; // now y will become x, now search the place for x
				}
				A[x] = x; // place the x to its correct position
				if(A[i]!=i){//check if while loop hasn't set the correct value at A[i]
					A[i] = -1; // if not then put -1 at the vacated place
				}
				
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int A[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		System.out.println("Fixed Indexed Array " + Arrays.toString(fix(A)));
		int B[] = { 19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2,
				14, 17, 4, };
		System.out.println("Fixed Indexed Array " + Arrays.toString(fix(B)));

	}

}
