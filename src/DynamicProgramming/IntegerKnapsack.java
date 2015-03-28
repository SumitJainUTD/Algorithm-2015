package DynamicProgramming;

public class IntegerKnapsack {

	// bottom up manner
	public int solveDP(int[] size, int[] value, int Capacity) {
		int[] solution = new int[Capacity + 1];
		solution[0] = 0; // if capacity is 0, max value =0
		int[] temp = new int[size.length];
		// store the temporary solutions for every capacity using evey size of
		// knapsack
		for (int cap = 1; cap < solution.length; cap++) {
			for (int j = 0; j < temp.length; j++) {
				temp[j] = 0;
			}
			// check if size<=capacity
			for (int j = 0; j < temp.length; j++) {
				if (size[j] <= cap) {
					temp[j]=Math.max(solution[cap-1],solution[cap-size[j]]+value[j]);
				}
			}
			solution[cap]=-1;
			for(int j=1;j<temp.length;j++){
				if(temp[j]>0 && (solution[cap]==-1 || solution[cap]<temp[j])){
					solution[cap]=temp[j];
				}
			}
		}
		return solution[Capacity];
	}

	public static void main(String[] args) {
		int[] size = { 1, 2, 3, 4, 5 };
		int[] value = { 1, 2, 5, 7, 8 };
		int Capacity = 10;
		IntegerKnapsack i = new IntegerKnapsack();
		System.out.println(i.solveDP(size, value, Capacity));
	}

}
