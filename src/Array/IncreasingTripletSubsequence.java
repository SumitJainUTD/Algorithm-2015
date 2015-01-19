package Array;

import java.util.Arrays;

public class IncreasingTripletSubsequence {
	//Find a sorted subsequence of size 3 in linear time
	// Given an integer array A[1..n], find an instance of i,j,k where 0 < i < j
	// < k <= n and A[i] < A[j] < A[k].
	public void triplet(int[] arrA) {
		int[] Lmin = new int[arrA.length];
		int[] Rmax = new int[arrA.length];
		int leftMinIndex = 0;
		int leftMinValue = arrA[0];
		int rightMaxValue = arrA[arrA.length - 1];
		int rightMaxIndex = arrA.length - 1;

		// traverse the main array and fill the Lmin array with the index
		// position which has the minimum value so far
		for (int i = 0; i < arrA.length; i++) {
			if (leftMinValue > arrA[i]) {
				leftMinIndex = i;
				leftMinValue = arrA[i];
			}
			Lmin[i] = leftMinIndex;
		}
//		System.out.println(Arrays.toString(Lmin));
		// traverse the main array backwords and fill the Rmax array with the
		// index position which has the maximun value so far
		for (int i = arrA.length - 1; i >= 0; i--) {
			if (rightMaxValue < arrA[i]) {
				rightMaxIndex = i;
				rightMaxValue = arrA[i];
			}
			Rmax[i] = rightMaxIndex;
		}
//		System.out.println(Arrays.toString(Rmax));
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[Lmin[i]] < arrA[i] && arrA[Rmax[i]] > arrA[i]) {
				System.out.println("Triplet " + arrA[Lmin[i]] + "  " + arrA[i]
						+ "  " + arrA[Rmax[i]]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		int arrA[] = {10,9,4,3,2,1,7,3,1,11,2,6,9};
		IncreasingTripletSubsequence i = new IncreasingTripletSubsequence();
		i.triplet(arrA);
		

	}

}
