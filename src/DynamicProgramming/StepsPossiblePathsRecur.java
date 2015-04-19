package DynamicProgramming;

public class StepsPossiblePathsRecur {
		public int possibleWays(int n) {
			if (n < 1) {
				return 0;
			}
			return 1 + possibleWays(n - 1) + possibleWays(n - 2)
					+ possibleWays(n - 3);
		}

	public int poosibleWaysDyna(int n, int[] dyn) {
		if (n < 1) {
			return 0;
		}
		if (dyn[n] > 0) {
			return dyn[n];
		}
		dyn[n]= 1 + poosibleWaysDyna(n - 1, dyn) + poosibleWaysDyna(n - 2, dyn)
				+ poosibleWaysDyna(n - 3, dyn);
		return dyn[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		StepsPossiblePathsRecur s = new StepsPossiblePathsRecur();	
		System.out.println(s.possibleWays(n));
		int[] dyn = new int[n + 1];
		System.out.println(s.poosibleWaysDyna(n, dyn));	
	}

}
