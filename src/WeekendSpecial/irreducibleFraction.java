package WeekendSpecial;

import java.io.ObjectInputStream.GetField;

public class irreducibleFraction {

	// et the user enter a decimal number. The range allowed is 0.0001 to
	// 0.9999. Only four decimal places are allowed. The output should be an
	// irreducible fraction.
	// Eg: If the user enters 0.35, the irreducible fraction will be 7/20.
	
	public static void fracion(double x){
		String a = ""+x;
		String spilts [] = a.split("\\.");
		int b = spilts[1].length();
		int denominator = (int) Math.pow(10, b);
		int nerumrator = (int)(x*denominator);
		int gcd = getGCD(nerumrator, denominator);
		String fraction = "" + nerumrator/gcd + "/" + denominator/gcd ;
		System.out.println(fraction);
	}
	public static int getGCD(int n1, int n2){
		if(n2==0){
			return n1;
		}
		return getGCD(n2, n1%n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fracion(0.1234);
	}
	

}
