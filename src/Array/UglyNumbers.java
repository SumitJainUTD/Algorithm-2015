package Array;

//Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence
//1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
//shows the first 11 ugly numbers. By convention, 1 is included.
public class UglyNumbers {
	public int UglyNO(int x) {
		int number = 1;
		int uglyCount = 1;
		while (uglyCount < x) {
			number++;
			int a = divideQuotient(number, 2);// quotient after removing 2
												// powers
			int b = divideQuotient(a, 3);// quotient after removing 3 powers
			int c = divideQuotient(b, 5);// quotient after removing 5 powers
			if (c == 1) { // if remainder is 1, means ugly number
				uglyCount++;
			}
		}
		return number;
	}

	public int divideQuotient(int x, int y) {
		while (x % y == 0) {// if x = 12 and y = 2 => return 12/2 power 2 = 3
			x = x / y;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		UglyNumbers u = new UglyNumbers();
		for (int i = 1; i <= 20; i++) {
			System.out.print(u.UglyNO(i) + " ");
		}

	}

}
