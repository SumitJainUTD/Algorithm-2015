package WeekendSpecial;

public class irreducibleFraction {

	// Eg: If the user enters 0.35, the irreducible fraction will be 7/20.

	public static void fracion(double x) {
		String a = "" + x;
		String spilts[] = a.split("\\."); // split using decimal
		int b = spilts[1].length(); // find the decimal length
		int denominator = (int) Math.pow(10, b); // calculate the denominator
		int numerator = (int) (x * denominator); // calculate the nerumrator Ex
													// 1.2*10 = 12
		int gcd = getGCD(numerator, denominator); // Find the greatest common
													// divisor bw them
		String fraction = "" + numerator / gcd + "/" + denominator / gcd;
		System.out.println(fraction);
	}

	public static int getGCD(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return getGCD(n2, n1 % n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fracion(0.35);
		fracion(1.2);
	}

}
