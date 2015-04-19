package Bloomberg;

public class SecondLargestElement {

	public static int findSecond(int[] A) {
		int fstNo = A[0];
		int sndNo = -1;
		for (int i = 1; i < A.length; i++) {
			if (fstNo < A[i]) {
				sndNo = fstNo;// store the first largest no value to second
								// largest
				fstNo = A[i];
			}else if(sndNo<A[i]){
				sndNo = A[i];
			}
		}
		return sndNo;
	}

	public static void main(String[] args) {
//		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int [] A = {2,1,3,10,7};
		System.out.println(findSecond(A));

	}

}
