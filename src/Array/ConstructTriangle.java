package Array;

import java.util.Arrays;

public class ConstructTriangle {

	public void print(int [] A){
		if(A.length>=1){
			int newLen = A.length-1;
			int [] temp = new int[newLen];
			int count = 0;
			for(int i=0;i<A.length-1;i++){
				int x = A[i] + A[i+1];
				temp[count]=x;
				count++;
			}
			print(temp);
			System.out.println(Arrays.toString(A));
		}
	}
	public static void main(String[] args) {
		int [] A = {4,7,3,6,7};
		ConstructTriangle c = new ConstructTriangle();
		c.print(A);

	}

}
