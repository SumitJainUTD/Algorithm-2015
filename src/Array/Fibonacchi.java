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

	public void fibDP(int x) {
		int fib[] = new int[x+1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < x+1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int i = 0; i < x+1; i++) {
			System.out.print(fib[i] + "  ");
		}
	}

	public static void main(String args[]) {
		int x = 6;
		Fibonacchi i = new Fibonacchi();
//		for (int y = 1; y <= x; y++) {
//			System.out.print(i.fibRecur(y) + " ");
//		}
		System.out.println(i.fibRecur(x));
		i.fibDP(x);

	}
}
