package DynamicProgramming;

public class RodCutting {

	public static int profit(int[] value, int length) {
		if (length <= 0)
			return 0;
			// either we will select it or ignore it
			int max = -1;
			for(int i=0;i<value.length;i++)
				max = Math.max(max, value[i] + profit(value, length-(i+1)));
			
			return max;
		
	}

	public static void main(String[] args) {
		int [] value = {2,5,7};
		int len = 1;
		System.out.println(profit(value, len));

	}

}
