package DynamicProgramming;

public class WaysToCoinChange {

	public static int total(int n, int[] v, int i) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		//means coins over and n>0 so no solution
		if(i==v.length && n>0){
			return 0;
		}
		return total(n-v[i],v,i ) + total(n, v, i+1);
	}
	
	public static void dynamic(int [] v, int n){
		int [][] solution = new int[v.length][n+1];
		
		for(int i=0;i<v.length;i++){
			solution[i][0]=1;
		}
		for(int i=0;i<v.length;i++){
			for(int j=1;j<=n;j++){
				
			}
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int[] v = { 1, 2, 3 };
		System.out.println(total(n, v,0));

	}

}
