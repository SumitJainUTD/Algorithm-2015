package Array;

import java.util.Arrays;

public class CountingSort {

	public int [] sort(int [] A){
		int [] B = new int [A.length+1];
		int [] C = new int [A.length+1];
		
		for(int i=0;i<C.length;i++){
			C[i]=0;
		}
		for(int i=0;i<A.length;i++){
			int x = C[A[i]];
			x++;
			C[A[i]] = x;
		}
		for(int i=1;i<C.length;i++){
			C[i]=C[i] + C[i-1];
		}
		for(int i=A.length-1;i>=0;i--){
			int x = C[A[i]];
			B[x]=A[i];
			x--;
			C[A[i]] = x;			
		}
		return B;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {2,1,4,5,7,1,7,1,8,9,10,11,17,18,3,2,4,9};
		System.out.println("Array : " + Arrays.toString(A));
		CountingSort c = new CountingSort();
		int [] B = c.sort(A);
		System.out.println("Array : " + Arrays.toString(B));

	}

}
