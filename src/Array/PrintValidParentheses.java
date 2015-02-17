package Array;

public class PrintValidParentheses {

	public static void Validparentheses(int openP, int closeP, String string) {
		if (openP == 0 && closeP == 0) // mean all opening and closing in
										// string,
										// print it
			System.out.println(string);
		if (openP > closeP) // means closing parentheses is more than open ones
			return;
		if (openP > 0)
			Validparentheses(openP - 1, closeP, string + "("); // put ( and
																// reduce
																// the count by
																// 1
		if (closeP > 0)
			Validparentheses(openP, closeP - 1, string + ")"); // put ) and
																// reduce
																// the count by
																// 1
	}

	public static void printParentheses(int n) {
		Validparentheses(n / 2, n / 2, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printParentheses(n);
	}
}
