package WeekendSpecial;

import java.util.Arrays;

	public class WellFormedStrings {
	
		// Logic:
		// 1. Get the input sequence
		// 2. Find out all the permutations of a String
		// 3. Before printing if the permutation is well formed.
		char[] A;
	
		public void wellFormedString(String S) {
			A = S.toCharArray();
			permutation(A, 0);
		}
	
		public void permutation(char[] A, int left) {
			if (left == A.length) {
				if (isWellFormed(A)) {
					System.out.println(Arrays.toString(A));
				}
				return;
			}
			for (int i = left; i < A.length; i++) {
				swap(i, left);
				permutation(A, left + 1);
				swap(i, left);
			}
		}
	
		public void swap(int a, int b) {
			char temp = A[a];
			A[a] = A[b];
			A[b] = temp;
		}
	
		public boolean isWellFormed(char[] A) {
			boolean wellFormed = true;
			for (int i = 0; i < A.length - 1; i++) {
				if (Character.toLowerCase(A[i]) > Character.toLowerCase(A[i + 1])) {
					wellFormed = false;
					break;
				}
			}
			return wellFormed;
		}
	
		public static void main(String[] args) {
			String S = "Interview";
			System.out.println("Given String - " + S);
			WellFormedStrings i = new WellFormedStrings();
			i.wellFormedString(S);
	
		}
	
	}
