package Array;

public class UglyNumbersDP {

	public void UglyDP(int x) {
		// create the array of size, no of ugly numbers needed
		int[] DP = new int[x];
		// First solve optimal subproblems. starting from 1
		DP[0] = 1;
		int uglyIndex = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		while (uglyIndex < x) {
			int minIndex = getMin(DP, index2, index3, index5);
			if (minIndex == 2) {
				DP[uglyIndex++] = DP[index2] * 2;
				index2++;
			}
			if (minIndex == 3) {
				DP[uglyIndex++] = DP[index3] * 3;
				index3++;
			}
			if (minIndex == 5) {
				DP[uglyIndex++] = DP[index5] * 5;
				index5++;
			}
		}
		for(int i=0;i<DP.length;i++){
			System.out.print(DP[i] + " ");
		}

	}

	public int getMin(int[] DP, int i2, int i3, int i5) {
		int minIndex;
		if (DP[i2] * 2 < DP[i3] * 3) {
			minIndex = 2;
		} else {
			minIndex = 3;
		}
		if (minIndex == 2) {
			if (DP[i2] * 2 < DP[i5] * 5) {
				minIndex = 2;
			} else {
				minIndex = 5;
			}
		} else {
			if (DP[i3] * 3 < DP[i5] * 5) {
				minIndex = 3;
			} else {
				minIndex = 5;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		int x = 20;
		UglyNumbersDP u = new UglyNumbersDP();
		u.UglyDP(x);

	}

}
