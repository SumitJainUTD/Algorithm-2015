package DynamicProgramming;

public class Knapsack01 {

	public int solve(int[] weights, int[] value, int Capacity) {
		int[][] KP = new int[Capacity + 1][weights.length + 1];
		
		for (int i = 0; i <= Capacity; i++) {
			for (int j = 0; j <= weights.length; j++) {
				if(i==0||j==0){
					KP[i][j]=0;
				}
				else if (weights[j-1] <= i) {
					// Now we have two options, either choose jth weight OR not
					// Solve the problem for both options and choose the optimal
					// solution
					KP[i][j] = Math.max(KP[i][j-1], value[j-1] + KP[i - weights[j-1]][j-1]);
				} else {// solution will be the same as [i][j-1]
					KP[i][j] = KP[i][j-1];
				}
			}
		}
		return KP[Capacity][weights.length];
	}

	public static void main(String[] args) {
		int w[] = { 2, 3, 4, 5, 6 };
		int v[] = { 3, 5, 4, 6, 7 };
		Knapsack01 k = new Knapsack01();
		System.out.println(k.solve(w, v, 6));

	}

}
