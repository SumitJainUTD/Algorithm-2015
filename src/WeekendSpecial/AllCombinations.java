package WeekendSpecial;

public class AllCombinations {

	static int  [] B = {1,2,3} ;
	public void combinations(int[] A, int x) {
		if (x == A.length-1) {
			A[x]=0;
			printArray(A);
			A[x]=1;
			printArray(A);
			return;
		}
		A[x] = 0;
		combinations(A, x + 1);
		A[x] = 1;
		combinations(A, x + 1);		
	}
	public void printArray(int [] A){
		boolean isNULL = true;
		for(int i =0;i<B.length;i++){
			if(A[i]==1){
				System.out.print(B[i] + " ");
				isNULL = false;
			}
		}		
		System.out.println();
		if(isNULL){
			System.out.println("Empty Set");
		}
	}

	public static void main(String[] args) {
		AllCombinations a = new AllCombinations();
		int [] A = new int [B.length];
		a.combinations(A, 0);

	}

}
