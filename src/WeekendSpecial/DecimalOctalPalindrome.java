package WeekendSpecial;

public class DecimalOctalPalindrome {

	public String DecimalToOctal(int N) {
		String Oct = "";
		while (N > 0) {
			int x = N % 8;
			N = N / 8;
			Oct += x;
		}
		return Oct;
	}

	public boolean isPalindrome(String S) {
		int i = 0;
		int j = S.length() - 1;
		while (i < j) {
			if (S.charAt(i) != S.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public void findBothPalindrome(int start, int end) {
		for (int i = start; i <= end; i++) {
			String decimal = String.valueOf(i);
			if (isPalindrome(decimal)) {
				String Oct = DecimalToOctal(i);
				if (isPalindrome(Oct)) {
					System.out.print(Oct + "  ");
				}
			}
		}
	}

	public static void main(String[] args) {
		DecimalOctalPalindrome d = new DecimalOctalPalindrome();
		d.findBothPalindrome(1, 2000);
	}

}
