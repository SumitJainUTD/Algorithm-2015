package Array;

//Objective : find index in sorted array such that A[i] = i. 
public class MagicIndex {
	// perform modified binary search
	public int search(int[] A, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (mid == A[mid]) // check for magic index.
				return mid;
			if (mid > A[mid]) { // If mid>A[mid] means fixed point might be on
								// the right half of the array
				return search(A, mid + 1, end);
			} else {// If mid<A[mid] means fixed point might be on
				// the left half of the array
				return search(A, start, mid - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -1, 0, 1, 6, 4, 10 };
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.search(A, 0, A.length - 1));
	}

}
