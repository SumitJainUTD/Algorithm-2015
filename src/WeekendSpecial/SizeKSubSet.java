package WeekendSpecial;

public class SizeKSubSet {

	public void subset(int [] A, int start, int k, String subs){
		if(k==0){
			System.out.println(subs);
		}
		for(int i = start ;i<A.length;i++){
			subset(A, i+1, k-1, subs + A[i]);
		}
	}
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		SizeKSubSet i = new SizeKSubSet();
		i.subset(A, 0, 3, "");

	}

}
