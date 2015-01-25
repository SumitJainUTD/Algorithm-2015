package WeekendSpecial;

public class WellOrderedPasswrds {

	public static void printWellOrdered(int number, int prev, int n) {

		if (n == 0) {
			System.out.println(number);
			return;
		}

		for (int i = (prev + 1); i < 10; i++) {
			printWellOrdered(number * 10 + i, i, n - 1);
		}

	}

	public static void main(String[] args) {
		printWellOrdered(0, 0, 4);

	}

}
