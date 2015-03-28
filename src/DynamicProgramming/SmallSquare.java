package DynamicProgramming;

public class SmallSquare {

	String value ="";
	public void solve(int n) {
		int options = (int) Math.sqrt(n);
		//solve using recursion
		System.out.println(solveRecursively(n, options));
		//solve using Dynamic programming
		System.out.println(solveUsingDP(n, options));

	}

	public int solveRecursively(int n, int options) {
		if (n <= 0) {
			return 0;
		}
		int min = solveRecursively(n - 1 * 1, options);
		for (int i = 2; i <= options; i++) {
			if (n >= i * i) {
				min = Math.min(min, solveRecursively(n - i * i, options));
				value+=i;
			}
		}
		return min + 1;
	}

	public int solveUsingDP(int n, int options) {
		int MN[] = new int[n+1]; // Minimum numbers required whose sum is = n
		MN[0] = 0; // if number is 0 the answer is 0.
		int[] NUM = new int[options+1];
		// solve in bottom up manner
		for (int number = 1; number <= n; number++) {
			// reset the NUM[] for new i
			for (int j = 0; j <= options; j++) {
				NUM[j] = 0;
			}
			// now try every option one by one and fill the solution in NUM[]
			for (int j = 1; j <= options; j++) {
				// check the criteria
				if (j * j <= number) {
					// select the number, add 1 to the solution of number-j*j
					NUM[j] = MN[number - j * j] + 1;
				}
			}
			
			//Now choose the optimal solution from NUM[]
			MN[number]=-1;
            for(int j=1;j<NUM.length;j++){
                if(NUM[j]>0 && (MN[number]==-1 || MN[number]>NUM[j])){
                	MN[number]=NUM[j];
                }
            }
		}
		return MN[n];
	}

	public static void main(String[] args) {
		int N = 20;
		SmallSquare s = new SmallSquare();
		s.solve(N);

	}

}
