package DynamicProgramming;

public class StepsPossiblePathsRecur {
	static long startTime;
	static long endTime;
	public int possibleWays(int n){
		System.out.println("recur");
		if(n<1){
			return 0;
		}
		return 1+possibleWays(n-1)+possibleWays(n-2)+possibleWays(n-3);
	}
	public int poosibleWaysDyna(int n, int [] dyn){
		if(n<1){
			return 0;
		}
		if(dyn[n]>0){
			return dyn[n];
		}
		return 1+poosibleWaysDyna(n-1, dyn)+poosibleWaysDyna(n-2, dyn)+poosibleWaysDyna(n-3, dyn);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		StepsPossiblePathsRecur s = new StepsPossiblePathsRecur();
		startTime = System.currentTimeMillis();
		System.out.println(s.possibleWays(n));	
		endTime = System.currentTimeMillis();
		System.out.println("Recursion took " + (endTime - startTime) + " milliseconds"); 
		startTime = System.currentTimeMillis();
		int [] dyn = new int[n+1];
		System.out.println(s.poosibleWaysDyna(n, dyn));
		endTime = System.currentTimeMillis();
		System.out.println("Dynamic Programming took " + (endTime - startTime) + " milliseconds");
	}

}
