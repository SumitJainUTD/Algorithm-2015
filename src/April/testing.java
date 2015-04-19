package April;

import java.util.Arrays;

public class testing {

	public static void print(int [] A, int x){
		if(x==A.length){
			System.out.println(Arrays.toString(A));
		}else{
			A[x]=0;
			print(A, x+1);
			A[x]=1;
			print(A,x+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int [] A = new int[n];
//		print(A, 0);
		int i=0;
		for(i=0;i<=5;i++){
			System.out.print(i);
		}
		System.out.println(i);
	}

}
