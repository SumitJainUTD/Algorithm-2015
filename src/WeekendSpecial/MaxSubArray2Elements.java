package WeekendSpecial;

import java.util.Arrays;

public class MaxSubArray2Elements {

	// Find the largest sum contiguous sub array. The length of the returned sub
	// array must be at least of length 2.
	///modify the Kadane Algorithm
	
	public static void maxArray(int [] A){
		int maxCurrent = A[0] + A[1];
		int maxCurrStart =0;
		int maxCurrEnd = 1;
		int maxSoFar = maxCurrEnd;
		int maxStart =0;
		int maxEnd =1;
		for(int i=2;i<A.length;i++){
			if(A[i]+A[i-1]>maxCurrent+A[i]){
				maxCurrent =A[i]+A[i-1];
				maxCurrStart = i-1;
				maxCurrEnd = i;
			}else{
				maxCurrent = maxCurrent+A[i];
				maxCurrEnd = i;
			}
			
			if(maxSoFar<maxCurrent){
				maxSoFar = maxCurrent;
				maxEnd = maxCurrEnd;
				maxStart = maxCurrStart;
			}
		}	
		int [] result = new int [maxEnd-maxStart+1];
		int counter=0;
		for(int i=maxStart;i<=maxEnd;i++){
			result[counter++] = A[i];
		}
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		int [] A = { -2,2,-6,-10,-4,-1,-1,-2,7};
		maxArray(A);
	}
		

}
