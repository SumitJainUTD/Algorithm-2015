package Array;

//Objective : find index in sorted array such that A[i] = i. 
public class MagicIndex {
	// perform modified binary search
	public int search(int[] A, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (mid == A[mid])
				return mid;
			if (mid > A[mid]) {
				search(A, mid+1, end);
			}else{
				search(A,start,mid-1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {-1,0,2,6,7,10};
		MagicIndex m = new MagicIndex();
		System.out.println("Magic index " + m.search(A, 0, A.length-1) );
	}

}
