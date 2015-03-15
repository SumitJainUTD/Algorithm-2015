package Array;

public class Fibonacchi {
	
	public int fibRecur(int x) {
		if (x == 0)
			return 0;
		if (x == 1)
			return 1;
		else {
			int f = fibRecur(x - 1) + fibRecur(x - 2);
			return f;
		}

	}

	public int fibDP(int x) {
		int fib[] = new int[x + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[x];
	}
	int n=5;
	int fib[] = new int[n];
	public int fibTopDown(int n) {		
		if(n==0) return 1;
		if(n==1) return 1;
		if(fib[n]!=0){
			return fib[n]; 
		}else{
			fib[n] = fibTopDown(n-1) + fibTopDown(n-2);
			return fib[n];
		}
	}

	public static void main(String args[]) {
		int x = 6;
		Fibonacchi i = new Fibonacchi();
		// for (int y = 1; y <= x; y++) {
		// System.out.print(i.fibRecur(y) + " ");
		// }
		System.out.println(x + "th fibonachi Number is(Recursion) "
				+ i.fibRecur(x));
		System.out.println(x + "th fibonachi Number is (DP) " + i.fibDP(x));
		System.out.println(x + "th fibonachi Number is (DP Top Down) " + i.fibTopDown(5));

	}
}
